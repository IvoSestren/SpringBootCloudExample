package br.com.strn.cloudexample.products

import com.google.common.collect.ImmutableMap
import org.springframework.core.env.Environment
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/products")
class ProductController(
    val environment: Environment
) {

    @GetMapping
    fun findAll(): Map<Long, String>? {
        val port = environment.getProperty("local.server.port")!!.toLong();

        return ImmutableMap.of(
            1L, "Product 1",
            2L, "Product 2",
            3L, "Product 3",
            4L, "Product 4",
            port, "Port"
        )
    }
}