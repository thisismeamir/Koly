package com.thisismeamir.koly.cpp.cppflattener

import com.thisismeamir.koly.cpp.utils.findFiles
import java.io.File


class CppFlatten {
    val root: String
    val out: String
    val buildSystem: BuildSystem
    constructor(rootPath: String, outputPath: String) {
        println("C++ Flattener initialized with rootPath: $rootPath and outputPath: $outputPath")
        root = rootPath
        out = outputPath
        buildSystem = recognizeBuildSystem()
        if (buildSystem == BuildSystem.OTHER) {
            Error("Could not recognize the build system used in the project at: $rootPath").printStackTrace()
        }
    }

    fun getCMakeDependencies() : List<String> {
        val rootFolder = File(root)
        val cmakeFiles = findFiles(rootFolder, "CMakeLists.txt", isExtension = false, depth = 1)
        val dependencies = mutableSetOf<String>()
        for (cmakeFile in cmakeFiles) {
            val lines = cmakeFile.readLines()
            for (line in lines) {
                val trimmedLine = line.trim()
                if (trimmedLine.startsWith("find_package(")) {
                    val parts = trimmedLine.removePrefix("find_package(").removeSuffix(")").split(" ")
                    if (parts.isNotEmpty()) {
                        dependencies.add(parts[0])
                    }
                } else if (trimmedLine.startsWith("add_subdirectory(")) {
                    val parts = trimmedLine.removePrefix("add_subdirectory(").removeSuffix(")").split(" ")
                    if (parts.isNotEmpty()) {
                        dependencies.add(parts[0])
                    }
                }
            }
        }
        return dependencies.toList()
    }

    fun getSourceFiles() : List<File> {
        val rootFolder = File(root)
        return findFiles(rootFolder, "cpp", isExtension = true, depth = -1) +
                findFiles(rootFolder, "cxx", isExtension = true, depth = -1) +
                findFiles(rootFolder, "c", isExtension = true, depth = -1) +
                findFiles(rootFolder, "h", isExtension = true, depth = -1) +
                findFiles(rootFolder, "hpp", isExtension = true, depth = -1)
    }

    fun recognizeBuildSystem() : BuildSystem {
        val rootFolder = File(root)
        if (!rootFolder.exists() || !rootFolder.isDirectory) {
            Error("The provided root path does not exist or is not a directory: $root").printStackTrace()
        }

        val cmakeFiles = findFiles(rootFolder, "CMakeLists.txt", isExtension = false, depth = 1)
        if (cmakeFiles.isNotEmpty()) {
            return BuildSystem.CMAKE
        }

        val makefiles = findFiles(rootFolder, "Makefile", isExtension = false, depth = 1)
        if (makefiles.isNotEmpty()) {
            return BuildSystem.MAKEFILE
        }

        val bazelFiles = findFiles(rootFolder, "BUILD", isExtension = false, depth = 2) +
                findFiles(rootFolder, "WORKSPACE", isExtension = false, depth = 1)
        if (bazelFiles.isNotEmpty()) {
            return BuildSystem.BAZEL
        }

        val gradleFiles = findFiles(rootFolder, "build.gradle", isExtension = false, depth = 2) +
                findFiles(rootFolder, "settings.gradle", isExtension = false, depth = 1)
        if (gradleFiles.isNotEmpty()) {
            return BuildSystem.GRADLE
        }

        return BuildSystem.OTHER
    }

    fun makeCppProjectObject() : CppProject {
        val dependencies = when (buildSystem) {
            BuildSystem.CMAKE -> getCMakeDependencies()
            BuildSystem.MAKEFILE -> emptyList() // Implement if needed
            BuildSystem.BAZEL -> emptyList() // Implement if needed
            BuildSystem.GRADLE -> emptyList() // Implement if needed
            BuildSystem.OTHER -> emptyList()
        }
        val sourceFiles = getSourceFiles()
        return CppProject(File(root), buildSystem, dependencies, sourceFiles)
    }

    fun extractDependencies() : List<CMakeDependency> {
        // First we find all the CMakeLists.txt files in the project
        val rootFolder = File(root)
        val makeFiles  = findFiles(rootFolder, "CMakeLists.txt", isExtension = false, depth = -1)
        // In each CMakeLists.txt file, we look for lines that contain find_package or add_subdirectory
        val dependencies = mutableListOf<CMakeDependency>()
        for (makeFile in makeFiles) {
            val lines = makeFile.readLines()
            for (line in lines) {
                val trimmedLine = line.trim()
                if (trimmedLine.startsWith("find_package(")) {
                    val content = trimmedLine.removePrefix("find_package(").removeSuffix(")")
                    val parts = content.split(" ")
                    if (parts.isNotEmpty()) {
                        val name = parts[0]
                        val version = parts.getOrNull(1)
                        val required = parts.contains("REQUIRED")
                        val fetchLink = "https://cmake.org/cmake/help/latest/module/Find${name}.html"
                        dependencies.add(CMakeDependency(name, version, required, fetchLink))
                    }
                } else if (trimmedLine.startsWith("add_subdirectory(")) {
                    val content = trimmedLine.removePrefix("add_subdirectory(").removeSuffix(")")
                    val parts = content.split(" ")
                    if (parts.isNotEmpty()) {
                        val name = parts[0]
                        val fetchLink = "N/A"
                        dependencies.add(CMakeDependency(name, null, true, fetchLink))
                    }
                }
            }
        }
        return dependencies
    }

}

data class CMakeDependency(
    val name: String,
    val version: String?,
    val required: Boolean,
    val fetchLink: String
)

