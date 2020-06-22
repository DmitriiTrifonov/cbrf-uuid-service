package com.mitya1234.uuid.config

import com.mitya1234.uuid.service.UuidServiceImpl
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.validation.beanvalidation.MethodValidationPostProcessor

@Configuration
open class AppConfig {
    @Bean
    open fun uuidService() = UuidServiceImpl()

    @Bean
    open fun methodValidationPostProcessor(): MethodValidationPostProcessor {
        return MethodValidationPostProcessor()
    }
}