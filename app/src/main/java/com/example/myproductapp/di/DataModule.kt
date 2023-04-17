package com.example.myproductapp.di

import com.example.myproductapp.data.remote.ApiService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import retrofit2.Retrofit

private const val BASE_URL = "https://dummyjson.com/"

@Module
@InstallIn(ActivityComponent::class)
object DataModule {

    @Provides
    fun provideAnalyticsService(
        // Potential dependencies of this type
    ): ApiService {
        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .build()
            .create(ApiService::class.java)
    }
}