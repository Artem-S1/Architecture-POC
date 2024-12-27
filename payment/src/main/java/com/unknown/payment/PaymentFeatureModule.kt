package com.unknown.payment

import com.unknown.network.internal.NetworkClient
import com.unknown.payment.internal.repository.PaymentRepository
import com.unknown.payment.internal.network.PaymentNetworkManager
import com.unknown.payment.useCase.PaymentUseCase

object PaymentFeatureModule {
    private val retrofitClient = NetworkClient().getRetrofit()

    private val paymentNetworkManager: PaymentNetworkManager by lazy {
        PaymentNetworkManager(
            retrofit = retrofitClient
        )
    }
    private val paymentRepository: PaymentRepository by lazy {
        PaymentRepository(
            paymentNetworkManager
        )
    }

    fun provideUseCase(): PaymentUseCase {
        return PaymentUseCase(paymentRepository)
    }
}
