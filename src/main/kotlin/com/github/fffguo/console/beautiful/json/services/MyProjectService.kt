package com.github.fffguo.console.beautiful.json.services

import com.intellij.openapi.project.Project
import com.github.fffguo.console.beautiful.json.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
