package com.app.product.domain

import java.math.BigDecimal
import java.time.LocalDateTime

data class ProductId(val value: Long)
data class ProductName(val value: String)
data class Price(val value: BigDecimal) {
    init {
        require(value >= BigDecimal.ZERO) { "가격은 0원 이상이어야 합니다." }
    }
}

class Product(
        val id: ProductId? = null,
        val name: ProductName,
        val price: Price,
        val description : String,
        val stockQuantity : Long,
        val status : ProductStatus,
        val createAt : LocalDateTime,
        val updatedAt : LocalDateTime
)

enum class ProductStatus {
    ON_SALE, SOLD_OUT, DELETED
}