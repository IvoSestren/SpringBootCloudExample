package br.com.strn.cloudexample.customers

import com.google.common.collect.ImmutableMap
import org.springframework.core.env.Environment
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/customers")
class CustomerController(
    val environment: Environment
) {

    @GetMapping
    fun findAll() : Map<Long, String>? {
        val port = environment.getProperty("local.server.port")!!.toLong();

        return ImmutableMap.of(
            1L, "Customer 1",
            2L, "Customer 2",
            3L, "Customer 3",
            4L, "Customer 4",
            port, "Port"
        )
    }
}