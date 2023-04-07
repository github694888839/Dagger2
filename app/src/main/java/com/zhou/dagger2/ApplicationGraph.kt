package com.zhou.dagger2

import dagger.Component
import javax.inject.Singleton

@Singleton
@Component
interface ApplicationGraph {
    fun repository(): UserRepository
}