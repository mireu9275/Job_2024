package kr.eme.plugin.job.interfaces

import kr.eme.plugin.job.objects.User
import java.util.UUID

interface DataSource {

    fun loadUser(uuid: UUID): Boolean
    fun saveUser(uuid: User)

}