package kr.eme.plugin.job.extensions

import kr.eme.plugin.job.enums.MessageType
import kr.eme.plugin.job.managers.job.MessageManager
import org.bukkit.command.CommandSender

fun CommandSender.sendMessage(type: MessageType) { MessageManager.sendMessage(this, type) }