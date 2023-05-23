package com.main.core.di

import com.main.core.domain.DispatchersList
import org.koin.dsl.module

val coreModule = module {
    single<DispatchersList> { DispatchersList.Base() }
}