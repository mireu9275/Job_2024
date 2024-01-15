package kr.eme.plugin.job.objects.job

import kr.eme.plugin.job.enums.JobType
import org.bukkit.entity.Player

class SORCERER: Job(JobType.SORCERER) {
    override fun onSkill(player: Player, data: JobData) {
        player.sendMessage("당신의 직업은 ${data.jobType} 경험치는 ${data.exp} 입니다.")
    }
}