package eu.arcangelovicedomini.atmstatusbot.exception

import org.springframework.http.HttpStatus

enum class BotError constructor(val code: String, val responseStatus: HttpStatus, val defaultMessage: String) {
    TOKEN_INVALID("1001", HttpStatus.UNAUTHORIZED, "The given token is ivalid")
}