package eu.arcangelovicedomini.atmstatusbot.integration

import com.mashape.unirest.http.Unirest
import eu.arcangelovicedomini.atmstatusbot.integration.dto.GetWebhookInfoResponse
import eu.arcangelovicedomini.atmstatusbot.integration.dto.SetWebhookRequest
import eu.arcangelovicedomini.atmstatusbot.integration.dto.UserDTO
import kotlin.properties.Delegates

class TelegramBotApiService constructor(var baseUrl: String, val token: String) {
    var telegramUrl: String by Delegates.notNull()

    init {
        telegramUrl = "${baseUrl}/bot${token}"
        Unirest.setObjectMapper(TelegramObjMapper())
    }

    fun setWebhook(setWebhookRequest: SetWebhookRequest): Boolean {
        return Unirest.post("${telegramUrl}/setWebhook")
                .header("accept", "application/json")
                .body(setWebhookRequest)
                .asString().body.toBoolean()
    }

    fun getWebhookInfo(): GetWebhookInfoResponse {
        return Unirest.get("${telegramUrl}/getWebhookInfo")
                .header("accept", "application/json")
                .asObject(GetWebhookInfoResponse::class.java).body
    }

    fun getMe(): UserDTO {
        return Unirest.get("${telegramUrl}/getMe")
                .header("accept", "application/json")
                .asObject(UserDTO::class.java).body
    }
}