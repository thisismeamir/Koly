package com.iskportal.koly.parsers.cpp.catalog

data class ProjectNode(
    val name: String,
    val path: String,
    val type: NodeType,
    val children: List<ProjectNode>
    )