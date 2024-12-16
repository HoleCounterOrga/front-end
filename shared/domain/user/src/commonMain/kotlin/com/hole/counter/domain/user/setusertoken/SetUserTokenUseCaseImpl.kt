package com.hole.counter.domain.user.setusertoken

import com.hole.counter.data.user.localencryptedprefs.LocalEncryptedPreferencesRepository

class SetUserTokenUseCaseImpl(
    private val localEncryptedPreferencesRepository: LocalEncryptedPreferencesRepository
): SetUserTokenUseCase{

    override suspend fun invoke() {
        localEncryptedPreferencesRepository.setTokens()
    }
}