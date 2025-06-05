package com.app.product.application.mapper

import com.app.product.application.port.input.command.CreateProductCommand
import com.app.product.domain.*
import java.time.LocalDateTime

class ProductMapper {
    fun toDomain(cmd: CreateProductCommand): Product {
        return Product(
                id = null,
                name = ProductName(cmd.name),
                price = Price(cmd.price),
                stockQuantity = cmd.stockQuantity,
                status = ProductStatus.ON_SALE,
                createAt = LocalDateTime.now(),
                description = cmd.description
        )
    }
}