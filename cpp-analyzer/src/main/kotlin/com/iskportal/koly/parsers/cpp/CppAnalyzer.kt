package com.iskportal.koly.parsers.cpp

import com.iskportal.koly.parsers.CPP17Parser
import com.iskportal.koly.parsers.cpp.catalog.ProjectCatalog
import java.io.File

class CppAnalyzer {
    val projectCatalog: ProjectCatalog

    // First step of analyzer is to build a project catalog with basic info
    constructor(
        name: String,
        version: String,
        localDirectory: String,
        description: String?,
        author: String?,
        license: String?,
        repositoryUrl: String?
    ) {
        projectCatalog = ProjectCatalog(
            name = name,
            version = version,
            description = description,
            localDirectory = localDirectory,
            author = author,
            license = license,
            repositoryUrl = repositoryUrl,
            dependencies = null,
            projectTree = null
        )
    }

    // Recursively find all source files in the project directory
    fun findSourceFiles(): List<String> {
        val files: MutableList<String> = mutableListOf()
        val rootDir = File(projectCatalog.localDirectory)
        if (rootDir.exists() && rootDir.isDirectory) {
            rootDir.walk().forEach { file ->
                if (file.isFile && (file.extension == "cpp" || file.extension == "cxx" || file.extension == "h")) {
                    files.add(file.absolutePath)
                }
            }
        }
        return files
    }

    fun makeParser(file: String): CPP17Parser {
        val fileContent = File(file).readText()
        val charStream = org.antlr.v4.runtime.CharStreams.fromString(fileContent)
        val lexer = com.iskportal.koly.parsers.CPP17Lexer(charStream)
        val tokens = org.antlr.v4.runtime.CommonTokenStream(lexer)
        return CPP17Parser(tokens)
    }

    fun analuzeSingleFile(filePath: String) {
        println("Analyzing ${filePath.split("/").drop(6).joinToString("/")}...")
        val parser = makeParser(filePath)
        val tree = parser.translationUnit()
        // Further analysis would go here

        // Find namespaces:
        val namespaces = tree.declarationseq()?.declaration()?.filter { decl -> decl.namespaceDefinition() != null }
            ?.map { it.namespaceDefinition()!! }
        println("Found ${namespaces?.size ?: 0} namespaces in $filePath")
        namespaces?.forEach { namespace ->
            println(
                namespace.text
            )
        }
    }

    fun analyzeSourceFiles() {
        val sourceFiles = findSourceFiles()
        sourceFiles.map { filePath ->
            analuzeSingleFile(filePath)
        }
    }
}