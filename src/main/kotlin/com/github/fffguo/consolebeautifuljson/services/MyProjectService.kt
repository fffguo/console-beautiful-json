package com.github.fffguo.consolebeautifuljson.services

import com.intellij.openapi.project.Project
import com.github.fffguo.consolebeautifuljson.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
