package com.gowe.core.config

import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.databind.DeserializationFeature
import com.fasterxml.jackson.databind.ObjectMapper
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Primary
import org.springframework.http.converter.HttpMessageConverter
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer
import java.text.SimpleDateFormat

@Configuration
open class WebMvcConfig: WebMvcConfigurer {

    override fun configureMessageConverters(converters: MutableList<HttpMessageConverter<*>>) {
        super.configureMessageConverters(converters)
        converters.add(MappingJackson2HttpMessageConverter(objectMapper()))
    }

    @Bean
    @Primary
    open fun objectMapper():ObjectMapper{
        val objectMapper = ObjectMapper ()
        objectMapper.enable(JsonGenerator.Feature.WRITE_BIGDECIMAL_AS_PLAIN)
        objectMapper.enable(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS)

        objectMapper.configure(DeserializationFeature.FAIL_ON_IGNORED_PROPERTIES,false)
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES,false)
        objectMapper.configure(DeserializationFeature.FAIL_ON_NULL_FOR_PRIMITIVES,false)
        objectMapper.configure(DeserializationFeature.FAIL_ON_NULL_CREATOR_PROPERTIES,false)

        objectMapper.dateFormat = SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
        return objectMapper
    }

}