package kr.eme.plugin.job.managers

import kr.eme.plugin.job.objects.User
import java.util.UUID

object UserManager {
    private val userMap: HashMap<UUID, User> = HashMap()
    fun getUser(uuid: UUID): User? = userMap[uuid]
    fun registerUser(user: User) { userMap[user.uuid] = user }
    fun unRegisterUser(user: User) { userMap.remove(user.uuid) }
}