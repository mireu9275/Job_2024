package kr.eme.plugin.job.objects.job

import kr.eme.plugin.job.enums.JobType

class JobData(
    val jobType: JobType,
    level: Int = 1,
    exp: Long = 0
) {

    var level: Int = level
        private set
    var exp: Long = exp
        private set
    fun addExp(amount: Long){
        val finalExp = exp + amount
    }
    fun levelUp() {
        level += 1
        exp = 0
    }
}