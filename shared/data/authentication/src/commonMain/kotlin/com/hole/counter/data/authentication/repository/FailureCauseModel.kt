package com.hole.counter.data.authentication.repository

sealed class FailureCauseModel{

    data class Unknown(val sourceThrowable: Throwable) : FailureCauseModel()
}