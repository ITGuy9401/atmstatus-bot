package eu.arcangelovicedomini.atmstatusbot.exception

class BotException : RuntimeException {
    constructor(botError: BotError) : super("${botError.code} - ${botError.defaultMessage}")
    constructor(botError: BotError, message: String) : super("${botError.code} - ${botError.defaultMessage} - ${message}")
    constructor(botError: BotError, cause: Throwable) : super("${botError.code} - ${botError.defaultMessage}", cause)
    constructor(botError: BotError, message: String, cause: Throwable) : super("${botError.code} - ${botError.defaultMessage} - ${message}", cause)
}