package eu.arcangelovicedomini.atmstatusbot.integration.dto

class SetWebhookRequest constructor(var url: String) {
    var certificate: String? = null
    var max_connections: Int? = null
    var allowed_updates: Array<String>? = arrayOf()
}