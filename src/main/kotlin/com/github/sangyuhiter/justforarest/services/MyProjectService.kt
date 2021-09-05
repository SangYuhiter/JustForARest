package com.github.sangyuhiter.justforarest.services

import com.github.sangyuhiter.justforarest.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
