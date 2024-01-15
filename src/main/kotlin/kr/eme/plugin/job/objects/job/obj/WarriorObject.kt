package kr.eme.plugin.job.objects.job.obj

import kr.eme.plugin.job.enums.JobType
import kr.eme.plugin.job.interfaces.Killable
import org.bukkit.event.entity.EntityDeathEvent

class WarriorObject(key: String): JobObject(key, JobType.WARRIOR), Killable {
    override fun onHitEntityDeath(event: EntityDeathEvent) {
        val deceased = event.entity
        val killer = deceased.killer

        killer?.let {
            println("${killer.name} killed ${deceased.type}")
        }
    }
}