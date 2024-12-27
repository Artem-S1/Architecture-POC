package com.unknown.payment.internal.repository

import com.unknown.network.internal.NetworkResult
import com.unknown.payment.internal.network.PaymentNetworkManager
import com.unknown.payment.internal.network.models.request.PaymentRequestModel

internal class PaymentRepository(private val paymentNetworkManager: PaymentNetworkManager) {

    suspend fun onPayFine(): String {
        // Do something if need it
        val response = paymentNetworkManager.onPayFine(requestModel = PaymentRequestModel(1, 17000))

        return when (response) {
            is NetworkResult.Success -> {
                response.data.amount.toString()
            }
            is NetworkResult.Error -> {
               "Mockk error message"
            }
        }

    }
}
