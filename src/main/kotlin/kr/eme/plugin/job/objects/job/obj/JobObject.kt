package kr.eme.plugin.job.objects.job.obj

import kr.eme.library.coroutine.async
import kr.eme.plugin.job.enums.JobType
import kr.eme.plugin.job.main
import org.bukkit.configuration.file.YamlConfiguration
import java.io.File

abstract class JobObject(
    val key: String,
    val jobType: JobType,
    exp: Long = 0
) {
    var exp: Long = exp
        private set
    fun setExp(exp: Long) {
        this.exp = exp
        save()
    }
    fun save(){
        async {
            try {
                val file = File(main.dataFolder, "objects.yml")
                val config = YamlConfiguration.loadConfiguration(file)
                config.set("mine.$key.exp", exp)
                config.save(file)
            } catch (e: Exception) {
                main.warn("JobObject - save : ${e.message}")
            }
        }
    }
}