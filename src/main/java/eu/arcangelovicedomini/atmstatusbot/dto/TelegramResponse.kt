package eu.arcangelovicedomini.atmstatusbot.dto

import com.fasterxml.jackson.annotation.JsonIgnoreProperties

@JsonIgnoreProperties(ignoreUnknown = true)
class TelegramResponse<T> {
    var ok: Boolean = false
    var result: List<T> = listOf()
}