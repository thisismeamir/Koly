package com.iskportal.koly.parsers.cpp.catalog

data class ProjectCatalog(
    val name: String,
    val version: String,
    val description: String?,
    val author: String?,
    val license: String?,
    val repositoryUrl: String?,
    val dependencies: List<ProjectCatalog>?,
    val projectTree: ProjectNode?,
    val localDirectory: String
)

