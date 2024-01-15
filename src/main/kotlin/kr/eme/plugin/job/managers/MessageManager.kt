package kr.eme.plugin.job.managers

import kr.eme.plugin.job.enums.MessageType
import kr.eme.plugin.job.extensions.sendMessage
import kr.eme.plugin.job.main
import org.bukkit.command.CommandSender
import org.bukkit.configuration.file.YamlConfiguration
import java.io.File

object MessageManager {
    private lateinit var messageConfig: YamlConfiguration

    private val defaultMessageMap: HashMap<MessageType, String> = hashMapOf(
        MessageType.PREFIX to "[ 시스템 ]",
        MessageType.USAGE_MENU to "/직업"
    )

    fun setup() {
        val file = File(main.dataFolder, "messages.yml")
        if(!file.exists()) main.saveResource("messages.yml", false)
        messageConfig = YamlConfiguration.loadConfiguration(file)
    }

    fun sendMessage(target: CommandSender, messageType: MessageType) {
        target.sendMessage(getMessage(MessageType.PREFIX) + getMessage(messageType))
    }

    private fun getMessage(type: MessageType): String = messageConfig.getString(type.key) ?: defaultMessageMap[type]!!
}