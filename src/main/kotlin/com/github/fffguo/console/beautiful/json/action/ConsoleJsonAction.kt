package com.github.fffguo.console.beautiful.json.action

import com.alibaba.fastjson.JSON
import com.alibaba.fastjson.JSONObject
import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.actionSystem.PlatformDataKeys
import com.intellij.openapi.ui.Messages
import org.apache.http.util.TextUtils
import javax.swing.JTextField

/**
 * @author Administrator
 */
class ConsoleJsonAction : AnAction() {
    override fun actionPerformed(event: AnActionEvent) {
        val mEditor = event.getData(PlatformDataKeys.EDITOR) ?: return
        val model = mEditor.selectionModel
        val selectedText = model.selectedText
        if (TextUtils.isEmpty(selectedText)) {
            return
        }

        val prettyJson = JSONObject.toJSONString(JSON.parseObject(selectedText), true)
        val jTextField = JTextField(prettyJson)
        Messages.showTextAreaDialog(jTextField, "Beautiful Json", "123456")
    }
}