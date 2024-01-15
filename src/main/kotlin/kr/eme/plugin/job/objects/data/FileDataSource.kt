package kr.eme.plugin.job.objects.data

import kr.eme.plugin.job.enums.JobType
import kr.eme.plugin.job.interfaces.DataSource
import kr.eme.plugin.job.main
import kr.eme.plugin.job.objects.User
import kr.eme.plugin.job.objects.job.JobData
import org.bukkit.configuration.file.YamlConfiguration
import java.io.File
import java.util.*

class FileDataSource(): DataSource {
    override fun loadUser(uuid: UUID): Boolean {
        TODO("Not yet implemented")
    }

    override fun saveUser(uuid: User) {
        TODO("Not yet implemented")
    }

    private inner class UserBuilder(val uuid: UUID) {
        private val file = File("${main.dataFolder}\\database", "$uuid.yml")
        private val config = YamlConfiguration.loadConfiguration(file)

        private fun buildDefaultJobDataArray(): Array<JobData> = arrayOf()
    }
}