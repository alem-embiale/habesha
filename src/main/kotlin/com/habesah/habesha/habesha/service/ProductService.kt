package com.habesah.habesha.habesha.service

import com.habesah.habesha.habesha.domain.Product
import com.habesah.habesha.habesha.repository.ProductRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class ProductService {
    @Autowired
    lateinit var productRepository: ProductRepository

    fun getProducts(): List<Product>{
        val seats = mutableListOf<Int>()
        seats.add(1)
        seats.add(2)
        var seat = seats.filter{
            it == 1
        }
        seat.forEach { println(it) }
        val products: List<Product> = productRepository.findAll()
        products.forEach { println(it.id) }
        products.forEach { println(it.color) }
        products.forEach { println(it.price) }
        products.forEach {println(it.size)}
        return products
    }
}