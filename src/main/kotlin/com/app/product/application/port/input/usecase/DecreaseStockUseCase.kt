package com.app.product.application.port.input.usecase

import com.app.product.application.port.input.command.DecreaseStockCommand

interface DecreaseStockUseCase {
    fun decreaseStock(command : DecreaseStockCommand)
}