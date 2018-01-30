package com.binaryblacksheep.justthetip.common.injection

import android.content.Context
import com.binaryblacksheep.justthetip.App
import dagger.Binds
import dagger.Module
import dagger.android.AndroidInjectionModule

@Module(includes = [(AndroidInjectionModule::class)])
abstract class AppModule {
    @Binds
    abstract fun bindContext(app: App): Context
}