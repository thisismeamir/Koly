package com.iskportal.koly.parsers.cpp

import java.io.File
import kotlin.test.Test

class TestParser {

    @Test
    fun `Testing parser functionality`() {
        // getting simple.cpp from resources folder:
        val resource = this::class.java.classLoader.getResource("simple.cpp")
        val filePath = resource?.path ?: throw IllegalArgumentException("Resource not found")

        // Making a parser:
        val fileStream = File(filePath).inputStream()
        val charStream = org.antlr.v4.runtime.CharStreams.fromStream(fileStream)
        val lexer = com.iskportal.koly.parsers.CPP17Lexer(charStream)
        val tokens = org.antlr.v4.runtime.CommonTokenStream(lexer)
        val parser = com.iskportal.koly.parsers.CPP17Parser(tokens)
        val tree = parser.translationUnit()
        println(tree.toStringTree(parser))
    }
}