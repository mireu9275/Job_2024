package kr.eme.plugin.job.objects.job

import kr.eme.plugin.job.enums.JobType
import org.bukkit.entity.Player

abstract class Job(val jobType: JobType) {
    abstract fun onSkill(player: Player, data: JobData)

}