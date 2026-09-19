package com.stavrom.chirp.infra.database.mappers

import com.stavrom.chirp.domain.model.User
import com.stavrom.chirp.infra.database.entities.UserEntity

fun UserEntity.toUser(): User {
    return User(
        id = id!!,
        username = username,
        email = email,
        hasEmailVerified = hasVerifiedEmail
    )
}