package com.app.domain.product.service

import com.app.product.application.mapper.ProductMapper
import com.app.product.application.port.output.ProductRepository
import com.app.product.domain.*
import org.junit.Test
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.DisplayName
import org.mockito.Mock
import org.mockito.kotlin.mock
import java.math.BigDecimal
import java.time.LocalDateTime


class CreateProductServiceTest {

    private lateinit var productRepository: ProductRepository
    private lateinit var productMapper: ProductMapper
    @BeforeEach
    fun setup() {
        productRepository = mock()
        productMapper = mock()
    }
    @Test @DisplayName("CreateProductService - 상품 등록 성공테스트")
    fun testCreateProduct_positive() {
        //given
        val product = Product(
                            id =  ProductId(1),
                            name = ProductName("가디건"),
                            price = Price(10000 as BigDecimal),
                            description = "여름용 린넨 소재의 가디건",
                            stockQuantity = 20,
                            status = ProductStatus.ON_SALE,
                            createAt = LocalDateTime.now()
                        )
        //when
        productRepository.save(product)

        //then
    }
}