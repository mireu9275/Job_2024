package kr.eme.plugin.job

import kr.eme.library.objects.EmePlugin
import org.bukkit.configuration.file.FileConfiguration
import javax.sql.DataSource

internal lateinit var main: EmePlugin
internal lateinit var config: FileConfiguration
internal lateinit var dataSource: DataSource