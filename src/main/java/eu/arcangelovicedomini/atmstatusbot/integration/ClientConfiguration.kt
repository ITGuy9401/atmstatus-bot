package eu.arcangelovicedomini.atmstatusbot.integration

import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
open class ClientConfiguration constructor(
        @Value("cfg{telegram.bot.apiUrl}") val baseUrl: String,
        @Value("cfg{telegram.bot.apikey}") val token: String
) {

    @Bean
    fun telegramBotApiService(): TelegramBotApiService {
        return TelegramBotApiService(baseUrl, token)
    }
}