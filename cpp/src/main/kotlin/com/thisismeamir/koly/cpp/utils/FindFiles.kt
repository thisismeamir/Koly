package com.thisismeamir.koly.cpp.utils

import java.io.File

fun findFiles(
    rootFolder: File,
    pattern: String,
    isExtension: Boolean,
    depth: Int
): List<File> {
    if (!rootFolder.exists() || !rootFolder.isDirectory) {
        return emptyList()
    }

    val result = mutableListOf<File>()

    fun searchRecursively(folder: File, currentDepth: Int) {
        if (depth != -1 && currentDepth > depth) {
            return
        }

        folder.listFiles()?.forEach { file ->
            if (file.isFile) {
                val matches = if (pattern.isEmpty()) {
                    true // Empty pattern matches all files
                } else if (isExtension) {
                    file.extension.equals(pattern, ignoreCase = true)
                } else {
                    file.name.contains(pattern, ignoreCase = true)
                }

                if (matches) {
                    result.add(file)
                }
            } else if (file.isDirectory && (depth == -1 || currentDepth < depth)) {
                searchRecursively(file, currentDepth + 1)
            }
        }
    }

    searchRecursively(rootFolder, 0)
    return result
}