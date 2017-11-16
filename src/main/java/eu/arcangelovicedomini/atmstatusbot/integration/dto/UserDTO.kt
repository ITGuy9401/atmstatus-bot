package eu.arcangelovicedomini.atmstatusbot.integration.dto

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import kotlin.properties.Delegates

@JsonIgnoreProperties(ignoreUnknown = true)
class UserDTO {
    var id: Int by Delegates.notNull()
    var is_bot: Boolean by Delegates.notNull()
    var first_name: String by Delegates.notNull()
    var last_name: String? = null
    var username: String? = null
    var language_code: String? = null
}