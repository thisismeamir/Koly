package com.thisismeaimr.koly.cpp

import com.thisismeamir.koly.cpp.cppflattener.BuildSystem
import com.thisismeamir.koly.cpp.cppflattener.CppFlatten
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.runBlocking
import org.junit.jupiter.api.Test
import kotlin.test.assertTrue

class CppProjectAnalysis {
    val rootPath = "SetThisbeforeTesting" // e.g., "/path/to/your/cpp/project"
    @Test
    fun `Build system recognition`() {
        val analyzer = CppFlatten(rootPath, "../output-cpp")
        println("Analyzing C++ project at: $rootPath")
        val buildSystem = analyzer.recognizeBuildSystem()
        assertTrue {
            BuildSystem.CMAKE == buildSystem
        }
    }

    @Test
    fun `CMake dependencies extraction`() {
        val analyzer = CppFlatten(rootPath, "../output-cpp")
        println("Extracting CMake dependencies for project at: $rootPath")
        val dependencies = analyzer.getCMakeDependencies()
        println("Found dependencies: $dependencies")
        assertTrue {
            dependencies.isNotEmpty()
        }
    }

    @Test
    fun `C++ source files extraction`() {
        val analyzer = CppFlatten(rootPath, "../output-cpp")
        println("Extracting C++ source files for project at: $rootPath")
        val sourceFiles = analyzer.getSourceFiles()
        println("Found ${sourceFiles.size} source files.")
        assertTrue {
            sourceFiles.isNotEmpty()
        }
    }

    @Test
    fun `C++ project construction`() {
        val analyzer = CppFlatten(rootPath, "../output-cpp")
        println("Constructing C++ project representation for project at: $rootPath")
        val project = analyzer.makeCppProjectObject()
        println("Project build system: ${project.buildSystem}")
        println("Project dependencies: ${project.dependencies}")
        println("Project source files count: ${project.sourceFiles.size}")
        assertTrue {
            project.sourceFiles.isNotEmpty()
        }
    }

    @Test
    fun `Extracting Dependencies Dependencies`() = runBlocking {
        coroutineScope {
            val analyzer = CppFlatten(rootPath, "../output-cpp")
            println("Extracting dependencies' dependencies for project at: $rootPath")
            val allDependencies = analyzer.extractDependencies()
            println("All extracted dependencies and their sub-dependencies: $allDependencies")
            assertTrue {
                allDependencies.isNotEmpty()
            }
        }

    }
}