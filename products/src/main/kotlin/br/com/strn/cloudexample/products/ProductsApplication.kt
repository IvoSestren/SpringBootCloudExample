package br.com.strn.cloudexample.products

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.eureka.EnableEurekaClient

@SpringBootApplication
@EnableEurekaClient
class ProductsApplication

fun main(args: Array<String>) {
	runApplication<ProductsApplication>(*args)
}
