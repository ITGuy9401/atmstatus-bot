package eu.arcangelovicedomini.atmstatusbot.dto

import com.fasterxml.jackson.annotation.JsonIgnoreProperties

@JsonIgnoreProperties(ignoreUnknown = true)
class Update {
    var update_id: Int = 0
    var message: Message = Message()

}