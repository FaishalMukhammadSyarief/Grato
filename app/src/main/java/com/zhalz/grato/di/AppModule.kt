package com.zhalz.grato.di

import android.content.Context
import com.zhalz.grato.data.CounterSP
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
class AppModule {
    @Singleton
    @Provides
    fun provideCounterSP(@ApplicationContext context: Context) = CounterSP(context)
}