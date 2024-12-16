package com.hole.counter.data.user.localencryptedprefs

import com.hole.counter.core.encrypted_preferences.EncryptedPreferences
import com.hole.counter.data.user.localencryptedprefs.models.LocalEncryptedPreferencesRepositoryModel
import com.hole.counter.data.user.localencryptedprefs.models.TokenRepositoryModel

class LocalEncryptedPreferencesRepositoryImpl(
    private val encryptedPreferences: EncryptedPreferences
): LocalEncryptedPreferencesRepository{
    override suspend fun invoke(): LocalEncryptedPreferencesRepositoryModel {
        val tokenSettings = encryptedPreferences.getSharedPreferences("token")
        println("MYLOG: In reposutor")
        return if (tokenSettings.hasKey("token") && tokenSettings.hasKey("refresh_token")) {
            val token = encryptedPreferences.getSharedPreferences("token").getString("token", "")
            val refreshToken = encryptedPreferences.getSharedPreferences("token").getString("refresh_token", "")
            LocalEncryptedPreferencesRepositoryModel.Success(
                token = TokenRepositoryModel(token, refreshToken)
            )
        } else {
            LocalEncryptedPreferencesRepositoryModel.Failure
        }
    }
}