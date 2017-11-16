package eu.arcangelovicedomini.atmstatusbot

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
open class AtmstatusbotApplication

fun main(args: Array<String>) {
    SpringApplication.run(AtmstatusbotApplication::class.java, *args)
}
