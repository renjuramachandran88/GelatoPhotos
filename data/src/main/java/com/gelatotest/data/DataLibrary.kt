package com.gelatotest.data

import com.gelatotest.network.support.NetworkConfiguration
import retrofit2.Retrofit

class DataLibrary(
    private val retrofit: Retrofit,
    private val networkConfiguration: NetworkConfiguration
) {
    private val component = DaggerDataComponent.builder()
        .apply {
            retrofit(retrofit)
            networkConfiguration(networkConfiguration)
        }.build()
}
