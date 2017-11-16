package eu.arcangelovicedomini.atmstatusbot.dto

import com.fasterxml.jackson.annotation.JsonIgnoreProperties

@JsonIgnoreProperties(ignoreUnknown = true)
class Message {
    var message_id: Int = 0
    var from: User = User()
    var date: Int = 0
    var chat: Chat = Chat()
    var text: String = ""
}