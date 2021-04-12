package br.com.strn.cloudexample.customers

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.eureka.EnableEurekaClient

@SpringBootApplication
@EnableEurekaClient
class CustomersApplication

fun main(args: Array<String>) {
	runApplication<CustomersApplication>(*args)
}
