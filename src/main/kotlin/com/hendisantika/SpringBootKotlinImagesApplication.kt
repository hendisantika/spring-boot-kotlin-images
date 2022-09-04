package com.hendisantika

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean
import org.springframework.web.servlet.config.annotation.CorsRegistry
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer

@SpringBootApplication
class SpringBootKotlinImagesApplication {
    @Bean
    fun cors(): WebMvcConfigurer {

        return object : WebMvcConfigurer {

            override fun addCorsMappings(registry: CorsRegistry) {

                registry.addMapping("/**").allowedOrigins("http://localhost:63343")
            }
        }
    }
}

fun main(args: Array<String>) {
    runApplication<SpringBootKotlinImagesApplication>(*args)
}
