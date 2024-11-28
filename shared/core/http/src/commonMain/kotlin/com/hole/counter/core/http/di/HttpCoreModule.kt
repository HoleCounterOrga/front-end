package com.hole.counter.core.http.di

import org.koin.dsl.module
import com.hole.counter.core.http.HttpClient
import com.hole.counter.core.http.RetrofitClient

val httpCoreModule = module{
    single { HttpClient() }
    single { get<HttpClient>().provideHttpClient() }
    single { RetrofitClient(get()) }
    single { get<RetrofitClient>().provideKtorClient() }
}