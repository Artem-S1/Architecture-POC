package com.unknown.payment.internal.network

import com.unknown.network.internal.NetworkResult
import com.unknown.network.internal.safeApiCallExample
import com.unknown.payment.internal.network.models.request.PaymentRequestModel
import com.unknown.payment.internal.network.models.response.PaymentResponseModel
import retrofit2.Retrofit

internal class PaymentNetworkManager(retrofit: Retrofit) {

    private val paymentApi = retrofit.create(PaymentApi::class.java)

    suspend fun onPayFine(requestModel: PaymentRequestModel): NetworkResult<PaymentResponseModel> {
        return safeApiCallExample { paymentApi.onPayFine(requestModel) }
    }
}