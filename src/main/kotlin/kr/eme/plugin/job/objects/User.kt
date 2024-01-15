package kr.eme.plugin.job.objects

import kr.eme.plugin.job.enums.JobType
import kr.eme.plugin.job.objects.job.JobData
import java.util.UUID

class User(
    val uuid: UUID,
    private val jobData: Array<JobData>
){
    fun getJobData(jobType: JobType): JobData = jobData[jobType.ordinal]
}