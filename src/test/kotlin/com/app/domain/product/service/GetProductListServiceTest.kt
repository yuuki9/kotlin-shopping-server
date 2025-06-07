package com.app.domain.product.service

import com.app.product.application.mapper.ProductMapper
import com.app.product.application.port.output.ProductRepository
import com.app.product.application.service.CreateProductService
import com.app.product.application.service.GetProductListService
import com.app.product.domain.validator.ProductPolicyValidator
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import org.mockito.kotlin.mock

class GetProductListServiceTest {
    private lateinit var productRepository: ProductRepository
    private lateinit var target : CreateProductService
    @BeforeEach
    fun setup() {
        productRepository = mock()
        target = GetProductListService(productRepository)
    }
    @Test
    @DisplayName("GetProductListService - 상품 목록 조회 성공테스트")
    fun testProductListQuery_positive() {
        //given
        //when
        //then
    }
}