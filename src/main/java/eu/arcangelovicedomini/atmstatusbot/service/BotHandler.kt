package eu.arcangelovicedomini.atmstatusbot.service

import eu.arcangelovicedomini.atmstatusbot.dto.Update

interface BotHandler {
    fun onUpdate(update: Update);
}