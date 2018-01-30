package com.binaryblacksheep.justthetip

import android.content.Context
import android.support.annotation.NonNull
import com.binaryblacksheep.justthetip.common.injection.AppComponent
import com.binaryblacksheep.justthetip.common.injection.AppModule
import com.binaryblacksheep.justthetip.common.injection.DaggerAppComponent
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication
import dagger.android.HasActivityInjector

class App : DaggerApplication(), HasActivityInjector { // TEMP what does HasActivityInjector do?
    val appComponent: AppComponent by lazy { buildAppComponent() }

    override fun onCreate() {
        super.onCreate()
        DaggerAppComponent.builder().create(this).inject(this)
    }

    companion object {
        fun getAppComponent(context: Context): AppComponent {
            return (context.applicationContext as App).appComponent
        }
    }

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        val appComponent = DaggerAppComponent.builder()
                .application(this)
                .build()
        appComponent.inject(this)
        return appComponent
    }

//    @Override
//    protected AndroidInjector<? extends DaggerApplication> applicationInjector() {
//        AppComponent appComponent = DaggerAppComponent . builder ().application(this).build();
//        appComponent.inject(this);
//        return appComponent;
//    }

    @NonNull
    private fun buildAppComponent(): AppComponent {
        return DaggerAppComponent.builder()
                .appModule(AppModule())
                .build()
    }
}