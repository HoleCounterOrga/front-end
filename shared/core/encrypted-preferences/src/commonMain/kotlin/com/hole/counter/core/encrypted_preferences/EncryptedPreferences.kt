package com.hole.counter.core.encrypted_preferences

import com.russhwolf.settings.Settings

expect class EncryptedPreferences{
    fun getSharedPreferences(key: String): Settings
}