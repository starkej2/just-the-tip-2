package com.binaryblacksheep.justthetip.common.injection

import com.binaryblacksheep.justthetip.App
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Singleton
@Component(modules = arrayOf(
        AppModule::class,
        // TEMP        ActivityBindingModule::class,
        AndroidSupportInjectionModule::class))

interface AppComponent : AndroidInjector<DaggerApplication> {
//    override fun inject(instance: DaggerApplication) // TEMP need this?

//    fun inject(app: App)

    // TEMP need this?
    // Gives us syntactic sugar. we can then do DaggerAppComponent.builder().application(this).build().inject(this);
    // never having to instantiate any modules or say which module we are passing the application to.
    // Application will just be provided into our app graph now.
    @Component.Builder
    abstract class Builder : AndroidInjector.Builder<App>()
}