package eu.arcangelovicedomini.atmstatusbot.integration.dto

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import kotlin.properties.Delegates

@JsonIgnoreProperties(ignoreUnknown = true)
class AudioDTO {
    var file_id: String by Delegates.notNull()
    var duration: Int by Delegates.notNull()
    var performer: String? = null
    var title: String? = null
    var mime_type: String? = null
    var file_size: Integer? = null
}