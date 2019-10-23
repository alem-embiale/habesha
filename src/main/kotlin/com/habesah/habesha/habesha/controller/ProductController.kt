package com.habesah.habesha.habesha.controller

import com.habesah.habesha.habesha.domain.Product
import com.habesah.habesha.habesha.service.ProductService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api")
class ProductController {
    @Autowired
    lateinit var productService: ProductService
    @GetMapping("/products")
    fun getProducts(): List<Product> {
        return productService.getProducts()
    }
}