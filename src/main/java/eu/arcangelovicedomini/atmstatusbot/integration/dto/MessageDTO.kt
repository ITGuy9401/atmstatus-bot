package eu.arcangelovicedomini.atmstatusbot.integration.dto

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import kotlin.properties.Delegates

@JsonIgnoreProperties(ignoreUnknown = true)
class MessageDTO {
    var message_id: Int by Delegates.notNull()
    var from: UserDTO? = null
    var date: Int by Delegates.notNull()
    var chat: ChatDTO by Delegates.notNull()
    var forward_from: UserDTO? = null
    var forward_from_chat: ChatDTO? = null
    var forward_from_message_id: Int? = null
    var forward_signature: String? = null
    var forward_date: Int? = null
    var reply_to_message: MessageDTO? = null
    var edit_date: Int? = null
    var author_signature: String? = null
    var text: String? = null
    var entities: Array<MessageEntityDTO>? = null
    var caption_entities: Array<MessageEntityDTO>? = null
    var audio: AudioDTO? = null

}