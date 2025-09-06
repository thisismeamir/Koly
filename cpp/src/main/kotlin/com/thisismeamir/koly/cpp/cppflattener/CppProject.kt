package com.thisismeamir.koly.cpp.cppflattener

import java.io.File

data class CppProject(
    val rootDir: File,
    val buildSystem: BuildSystem,
    val dependencies: List<String>,
    val sourceFiles: List<File>
)