package com.app.product.application.mapper

import com.app.product.application.port.input.command.CreateProductCommand
import com.app.product.domain.model.*
import com.app.product.domain.validator.ProductPolicyValidator
import org.springframework.stereotype.Component
import java.time.LocalDateTime

@Component
class ProductMapper (private val validator: ProductPolicyValidator){
    fun toDomain(cmd: CreateProductCommand): Product {
        validator.validate(cmd)
        return Product(
                id = null,
                name = ProductName(cmd.name),
                price = Price(cmd.price),
                stockQuantity = cmd.stockQuantity,
                status = ProductStatus.ON_SALE,
                createAt = LocalDateTime.now(),
                description = cmd.description,
                category = cmd.category,
                gender = cmd.gender
        )
    }

}