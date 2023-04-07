package com.zhou.dagger2

import javax.inject.Inject
import javax.inject.Singleton

// @Inject lets Dagger know how to create instances of these objects
@Singleton
class UserRepository @Inject constructor(
    private val localUserDataSource: LocalUserDataSource,
    private val remoteUserDataSource: RemoteUserDataSource
) {

}