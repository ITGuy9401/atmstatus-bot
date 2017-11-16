package eu.arcangelovicedomini.atmstatusbot

import eu.arcangelovicedomini.atmstatusbot.dto.Update
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
open class BotController {

    @RequestMapping(value = "cfg{}/")
    fun webhook(@RequestBody update: Update) {

    }
}