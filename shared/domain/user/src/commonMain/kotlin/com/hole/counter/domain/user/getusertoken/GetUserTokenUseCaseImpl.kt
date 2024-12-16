package com.hole.counter.domain.user.getusertoken

import com.hole.counter.data.user.localencryptedprefs.LocalEncryptedPreferencesRepository
import com.hole.counter.data.user.localencryptedprefs.models.LocalEncryptedPreferencesRepositoryModel
import com.hole.counter.domain.user.getusertoken.models.GetUserTokenUseCaseModel

class GetUserTokenUseCaseImpl(
    private val localEncryptedPreferencesRepository: LocalEncryptedPreferencesRepository
): GetUserTokenUseCase {

    override suspend fun invoke(): GetUserTokenUseCaseModel =
        when(localEncryptedPreferencesRepository()){
            is LocalEncryptedPreferencesRepositoryModel.Success -> GetUserTokenUseCaseModel.Success
            is LocalEncryptedPreferencesRepositoryModel.Failure -> GetUserTokenUseCaseModel.Failure
        }
}