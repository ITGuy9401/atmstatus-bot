package eu.arcangelovicedomini.atmstatusbot.dto

import com.fasterxml.jackson.annotation.JsonIgnoreProperties

@JsonIgnoreProperties(ignoreUnknown = true)
class User {
    var id: Int = 0
}