package com.unknown.payment.useCase

import com.unknown.payment.internal.repository.PaymentRepository

class PaymentUseCase internal constructor(private val repository: PaymentRepository) {

    suspend fun onPayFine(): String {
        return repository.onPayFine()
    }
}