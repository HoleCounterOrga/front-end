package com.hole.counter.data.user.localencryptedprefs.models

sealed class LocalEncryptedPreferencesRepositoryModel{

    data class Success(val token: TokenRepositoryModel): LocalEncryptedPreferencesRepositoryModel()

    data object Failure: LocalEncryptedPreferencesRepositoryModel()
}