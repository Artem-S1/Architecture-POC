package com.unknown.network.internal

import retrofit2.HttpException
import java.io.IOException

suspend fun <T> safeApiCallExample(apiCall: suspend () -> T): NetworkResult<T> {
    return try {
        NetworkResult.Success(apiCall())
    } catch (throwable: Throwable) {
        when (throwable) {
            is IOException -> NetworkResult.Error("Network Error")
            is HttpException -> {
                val code = throwable.code()
                val message = throwable.message()
                NetworkResult.Error(message, code)
            }
            else -> NetworkResult.Error("Unknown Error")
        }
    }
}
