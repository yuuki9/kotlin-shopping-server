package com.app.product.adapter.port.output.persistence.mapper

import com.app.product.adapter.port.output.persistence.entity.ProductEntity
import com.app.product.domain.model.Price
import com.app.product.domain.model.Product
import com.app.product.domain.model.ProductName
import org.springframework.stereotype.Component

@Component
class ProductEntityMapper {
    //도메인 엔티티를 엔티티 도메인 객체로 변환
    //엔티티 객체를 도메인으로 변환
    fun toEntity(domain : Product): ProductEntity {
        return ProductEntity(
            id = null,
            name = domain.name.value,
            price = domain.price.value,
            description = domain.description,
            stockQuantity = domain.stockQuantity,
            status = domain.status,
            createAt = domain.createAt,
            updateAt = domain.updatedAt
        )
    }

    fun toDomain(productEntity: ProductEntity) : Product {
        return Product(
            id = null,
            name = ProductName(productEntity.name),
            price = Price(productEntity.price),
            stockQuantity = productEntity.stockQuantity,
            status = productEntity.status,
            createAt = productEntity.createAt,
            description = productEntity.description,
            updatedAt = productEntity.updateAt
        )
    }
}
