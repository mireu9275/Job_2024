package kr.eme.plugin.job.interfaces

import kr.eme.library.objects.EmePlugin
import kr.eme.plugin.job.managers.job.MessageManager
import kr.eme.plugin.job.managers.UserManager

interface MethodProvider {

    fun getPlugin(): EmePlugin
    fun getMessageManager(): MessageManager
    fun getUserManager(): UserManager
}