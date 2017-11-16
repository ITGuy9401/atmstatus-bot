package eu.arcangelovicedomini.atmstatusbot.integration.dto

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import kotlin.properties.Delegates

@JsonIgnoreProperties(ignoreUnknown = true)
class GetWebhookInfoResponse {
    var url: String by Delegates.notNull()
    var has_custom_certificate: Boolean? = null
    var pending_update_count: Int? = null
    var last_error_date: Int? = null
    var last_error_message: String? = null
    var max_connections: Int? = null
    var allowed_updates: Array<String>? = null

}