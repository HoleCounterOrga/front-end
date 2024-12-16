package com.hole.counter.core.encrypted_preferences.di

import com.hole.counter.core.encrypted_preferences.EncryptedPreferences
import org.koin.core.module.Module
import org.koin.dsl.module

actual val encryptedPreferencesModule: Module = module {
    single { EncryptedPreferences() }
}