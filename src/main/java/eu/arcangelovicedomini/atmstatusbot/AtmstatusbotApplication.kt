package eu.arcangelovicedomini.atmstatusbot

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer

@Configuration
@ConfigurationProperties
@SpringBootApplication
open class AtmstatusbotApplication {

    @Bean
    fun kotlinPropertyConfigurer() = PropertySourcesPlaceholderConfigurer().apply {
        setPlaceholderPrefix("cfg{")
        setIgnoreUnresolvablePlaceholders(true)
    }

    @Bean
    fun defaultPropertyConfigurer() = PropertySourcesPlaceholderConfigurer()


}

fun main(args: Array<String>) {
    SpringApplication.run(AtmstatusbotApplication::class.java, *args)
}