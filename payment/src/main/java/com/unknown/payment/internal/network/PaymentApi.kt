package com.unknown.payment.internal.network

import com.unknown.payment.internal.network.models.request.PaymentRequestModel
import com.unknown.payment.internal.network.models.response.PaymentResponseModel
import retrofit2.http.Body
import retrofit2.http.POST

interface PaymentApi {
    @POST("payments/{id}")
    suspend fun onPayFine(
        @Body paymentRequest: PaymentRequestModel
    ): PaymentResponseModel

}
