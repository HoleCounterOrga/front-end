package com.hole.counter.data.user.localencryptedprefs

import com.hole.counter.core.encrypted_preferences.EncryptedPreferences
import com.hole.counter.data.user.localencryptedprefs.models.LocalEncryptedPreferencesRepositoryModel
import com.hole.counter.data.user.localencryptedprefs.models.TokenRepositoryModel

class LocalEncryptedPreferencesRepositoryImpl(
    private val encryptedPreferences: EncryptedPreferences
): LocalEncryptedPreferencesRepository{

    override suspend fun getTokens(): LocalEncryptedPreferencesRepositoryModel {
        val settings = encryptedPreferences.getSharedPreferences("token")
        return if (settings.hasKey("token") && settings.hasKey("refresh_token")) {
            val token = encryptedPreferences.getSharedPreferences("token").getString("token", "")
            val refreshToken = encryptedPreferences.getSharedPreferences("token").getString("refresh_token", "")
            LocalEncryptedPreferencesRepositoryModel.Success(
                token = TokenRepositoryModel(token, refreshToken)
            )
        } else {
            LocalEncryptedPreferencesRepositoryModel.Failure
        }
    }

    override suspend fun setTokens() {
        val settings = encryptedPreferences.getSharedPreferences("token")
        settings.putString("token", "test")
        settings.putString("refresh_token", "test")
    }
}