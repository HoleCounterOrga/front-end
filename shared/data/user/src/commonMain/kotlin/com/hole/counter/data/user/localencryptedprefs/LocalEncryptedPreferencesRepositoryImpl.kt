package com.hole.counter.data.user.localencryptedprefs

import com.hole.counter.core.encrypted_preferences.EncryptedPreferences
import com.hole.counter.data.user.localencryptedprefs.models.LocalEncryptedPreferencesRepositoryModel

class LocalEncryptedPreferencesRepositoryImpl(
    private val encryptedPreferences: EncryptedPreferences
): LocalEncryptedPreferencesRepository{
    override suspend fun invoke(): LocalEncryptedPreferencesRepositoryModel {
        TODO("Not yet implemented")
    }

}