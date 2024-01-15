package kr.eme.plugin.job

import kr.eme.library.objects.EmePlugin

class Job : EmePlugin() {
    override fun onEnable() {
        main = this
        registerEvents(

        )

    }

    override fun onDisable() {
        // Plugin shutdown logic
    }
}
