package eu.arcangelovicedomini.atmstatusbot.integration

import com.mashape.unirest.http.ObjectMapper

class TelegramObjMapper : ObjectMapper {

    val objMapper = com.fasterxml.jackson.databind.ObjectMapper();

    override fun writeValue(value: Any?): String {
        return objMapper.writeValueAsString(value)
    }

    override fun <T : Any?> readValue(value: String?, valueType: Class<T>?): T {
        return objMapper.readValue(value, valueType)
    }
}