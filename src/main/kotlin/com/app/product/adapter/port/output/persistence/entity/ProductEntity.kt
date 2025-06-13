package com.app.product.adapter.port.output.persistence.entity

import com.app.product.domain.model.Category
import com.app.product.domain.model.Gender
import com.app.product.domain.model.ProductStatus
import jakarta.persistence.*
import java.math.BigDecimal
import java.time.LocalDateTime

@Entity
@Table(name = "wawa_product")
class ProductEntity(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    var id: Long? = null,

    @Column(name = "product_name")
    val name: String,

    @Column(name = "product_price")
    val price: BigDecimal,

    @Column(name = "product_des")
    val description: String,

    @Column(name = "product_stock")
    val stockQuantity: Long,

    @Enumerated(EnumType.STRING)
    @Column(name = "product_status")
    val status: ProductStatus,

    @Enumerated(EnumType.STRING)
    @Column(name = "product_gender")
    val gender: Gender,

    @Enumerated(EnumType.STRING)
    @Column(name = "product_category")
    val category: Category,

    @Column(name = "create_at")
    var createAt: LocalDateTime,

    @Column(name = "update_at")
    var updateAt: LocalDateTime?
)