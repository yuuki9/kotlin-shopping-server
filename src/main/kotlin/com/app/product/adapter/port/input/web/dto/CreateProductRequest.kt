package com.app.product.adapter.port.input.web.dto

import java.math.BigDecimal

data class CreateProductRequest(
    val name : String,
    val price : BigDecimal,
    val category: String,

)
