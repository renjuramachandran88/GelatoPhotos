package com.gelatotest.data

import com.gelatotest.data.remote.PhotoListService
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit

@Module
class DataModule {
    @Provides
    fun providesPhotoListService(retrofit: Retrofit): PhotoListService =
        retrofit.create(PhotoListService::class.java)
}