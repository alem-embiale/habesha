package com.habesah.habesha.habesha.repository

import com.habesah.habesha.habesha.domain.Product
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface ProductRepository: JpaRepository<Product, Long> {

}