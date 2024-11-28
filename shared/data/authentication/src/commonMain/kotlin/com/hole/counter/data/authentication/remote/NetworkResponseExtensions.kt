package com.hole.counter.data.authentication.remote

inline fun <T> NetworkResponse<T>.onSuccess(action: (T) -> Unit): NetworkResponse<T> {
    if (this is NetworkResponse.Success) action(data)
    return this
}

inline fun <T> NetworkResponse<T>.onError(action: (String, Throwable?) -> Unit): NetworkResponse<T> {
    if (this is NetworkResponse.Error) action(message, throwable)
    return this
}

inline fun <T> NetworkResponse<T>.onLoading(action: () -> Unit): NetworkResponse<T> {
    if (this is NetworkResponse.Loading) action()
    return this
}