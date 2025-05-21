package com.app.product.application.port.input.command

data class GetProductListQuery(
        val page: Int = 0,
        val size: Int = 20,
        val keyword: String? = null
)