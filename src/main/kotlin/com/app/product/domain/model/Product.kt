package com.app.product.domain.model

import java.math.BigDecimal
import java.time.LocalDateTime

data class ProductId(val value: Long)
data class ProductName(val value: String)
data class Price(val value: BigDecimal)

class Product(
    val id: ProductId? = null,
    val name: ProductName,
    val price: Price,
    val description : String,
    val stockQuantity : Long,
    val status : ProductStatus,
    val createAt : LocalDateTime,
    val updatedAt : LocalDateTime? = null,
    val gender: Gender,
    val category: Category
)

enum class ProductStatus {
    ON_SALE, SOLD_OUT, DELETED
}

enum class Gender {
    WOMEN, MEN, UNISEX
}

enum class Category {
    TOP, BOTTOM, OUTER, ACCESSORY
}