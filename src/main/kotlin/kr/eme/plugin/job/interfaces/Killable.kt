package kr.eme.plugin.job.interfaces

import org.bukkit.event.entity.EntityDeathEvent

interface Killable {
    fun onHitEntityDeath(event: EntityDeathEvent)
}