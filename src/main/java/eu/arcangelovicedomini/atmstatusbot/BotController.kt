package eu.arcangelovicedomini.atmstatusbot

import eu.arcangelovicedomini.atmstatusbot.dto.Update
import eu.arcangelovicedomini.atmstatusbot.exception.BotError
import eu.arcangelovicedomini.atmstatusbot.exception.BotException
import eu.arcangelovicedomini.atmstatusbot.service.BotHandler
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Value
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
open class BotController @Autowired constructor(
        val botHandler: BotHandler,
        @Value("cfg{telegram.bot.apikey}") val telegramToken: String
) {

    @RequestMapping(value = "{botToken}/webhook")
    fun webhook(@RequestParam(value = "botToken") botToken: String, @RequestBody update: Update) {
        if (botToken.equals(telegramToken)) botHandler.onUpdate(update) else throw BotException(BotError.TOKEN_INVALID)
    }
}