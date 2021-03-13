package com.gelatotest.data

import com.gelatotest.network.support.NetworkConfiguration
import dagger.BindsInstance
import dagger.Component
import retrofit2.Retrofit

@Component(modules = [DataModule::class])
interface DataComponent {
    @Component.Builder
    interface Builder {

        @BindsInstance
        fun retrofit(retrofit: Retrofit): Builder

        @BindsInstance
        fun networkConfiguration(networkConfiguration: NetworkConfiguration): Builder

        fun build(): DataComponent
    }
}