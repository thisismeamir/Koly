package com.iskportal.koly.parsers.cpp

import kotlin.test.Test

class TestAnalyzer {
    @Test
    fun `Finding namespaces`() {
        // loading the namespaces.cpp from resources folder:
        val resource = this::class.java.classLoader.getResource("namespaces.cpp")
        val filePath = resource?.path ?: throw IllegalArgumentException("Resource not found")

        // Loading Analyzer:
        val analyzer = CppAnalyzer(
            name = "Test",
            version = "0.0.1",
            localDirectory = filePath,
            description = "testing namespaces",
            author = "isk",
            license = "apache2.0",
            repositoryUrl = ""
        )

        analyzer.analuzeSingleFile(filePath)
    }
}