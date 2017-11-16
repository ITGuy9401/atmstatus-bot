package eu.arcangelovicedomini.atmstatusbot.dto

import com.fasterxml.jackson.annotation.JsonIgnoreProperties

@JsonIgnoreProperties(ignoreUnknown = true)
class Chat {
    var id: Int = 0
    var type: String = ""
    var title: String = ""
    var username: String = ""
}