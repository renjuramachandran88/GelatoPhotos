package com.gelatotest.domain

import com.gelatotest.domain.repository.PhotoRepository
import com.gelatotest.domain.usecase.PhotoUseCase
import dagger.Module
import dagger.Provides

@Module
class DomainModule {
    @Provides
    fun providesPhotoUseCase(repository: PhotoRepository): PhotoUseCase =
        PhotoUseCase(repository)
}