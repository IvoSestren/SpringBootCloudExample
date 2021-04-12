package br.com.strn.cloudexample.gateway

import org.springframework.cloud.gateway.route.RouteLocator
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class SpringCloudConfig {

    @Bean
    fun gatewayRoutes(builder: RouteLocatorBuilder): RouteLocator? {
        return builder.routes()
            .route { r -> r.path("/customers/**").uri("lb://CUSTOMERS") }
            .route { r -> r.path("/products/**").uri("lb://PRODUCTS") }
            .build()
    }
}