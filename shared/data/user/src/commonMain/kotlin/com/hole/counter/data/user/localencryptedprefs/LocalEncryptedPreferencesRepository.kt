package com.hole.counter.data.user.localencryptedprefs

import com.hole.counter.data.user.localencryptedprefs.models.LocalEncryptedPreferencesRepositoryModel

interface LocalEncryptedPreferencesRepository{
    suspend fun invoke(): LocalEncryptedPreferencesRepositoryModel
}