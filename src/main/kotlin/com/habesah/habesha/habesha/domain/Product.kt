package com.habesah.habesha.habesha.domain

import javax.persistence.*
import javax.persistence.Lob
import kotlin.jvm.Transient

@Entity
@Table(name="product")
data class Product(
        @Id
        @GeneratedValue
        @Column(name="id_product")
        val id: Long,

        @Column(name="Product_Name")
        val productName: String,

        @Column(name="Price")
        val price: Int,

        @Column(name="Description")
        val description: String,

        @Column(name="file_name")
        val fileName: String,

        @Lob
        @Column(name="Image")
        val image: List<Byte>?,

        @Column(name="Color")
        val color: String,

        @Column(name="Size")
        val size: String,

        @Transient
        val categoryLibIds: List<String>? = emptyList()
)