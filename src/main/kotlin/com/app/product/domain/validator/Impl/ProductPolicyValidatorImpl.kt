package com.app.product.domain.validator.Impl

import com.app.product.application.port.input.command.CreateProductCommand
import com.app.product.domain.repository.ProductRepository
import com.app.product.domain.model.ProductStatus
import com.app.product.domain.validator.ProductPolicyValidator
import org.springframework.stereotype.Component
import java.math.BigDecimal

@Component
class ProductCreationPolicyValidatorImpl(
        private val productRepository: ProductRepository
): ProductPolicyValidator {

    //상품명은 중복되어서는 안된다 상품명은 20자 이하 등록
    //상품소개는 1000자 이하
    //가격은 0원 이상이여야 한다
    //상품생성시 상태는 판매중만 허용
    override fun validate(command: CreateProductCommand) {
        validateName(command.name)
    }

    private fun validateName(name : String) {
        if(productRepository.existsByName(name)) {
            TODO("상품이름이 중복됩니다 에러 추가")
        }
    }

    private fun validatePrice(price : BigDecimal) {
        if (price < BigDecimal(0)) {
            TODO("상품 가격은 0원보다 커야 됩니다")
        }
    }

    private fun validateDescription(description: String) {
        if (description.length > 1000) {
            TODO("상품 설명은 1000자 이하 여야 합니다 에러 추가")
        }
    }

    private fun validateStatus(status: ProductStatus) {
        if (status != ProductStatus.ON_SALE) {
            TODO("상품생성시 상태는 판매중만 허용 에러추가")
        }
    }
}