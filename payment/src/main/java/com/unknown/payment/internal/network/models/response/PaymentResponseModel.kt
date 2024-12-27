package com.unknown.payment.internal.network.models.response

data class PaymentResponseModel(
    val id: Int,
    val amount: Int,
    val status: String,
)
