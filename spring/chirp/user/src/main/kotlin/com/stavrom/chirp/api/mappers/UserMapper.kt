package com.stavrom.chirp.api.mappers

import com.stavrom.chirp.api.dto.AuthenticatedUserDto
import com.stavrom.chirp.api.dto.UserDto
import com.stavrom.chirp.domain.model.AuthenticatedUser
import com.stavrom.chirp.domain.model.User

fun AuthenticatedUser.toAuthenticatedUserDto(
): AuthenticatedUserDto {
    return AuthenticatedUserDto(
        user = user.toUserDto(),
        accessToken = accessToken,
        refreshToken = refreshToken,
    )
}

fun User.toUserDto(): UserDto {
    return UserDto(
        id = id,
        email = email,
        username = username,
        hasVerifiedEmail = hasEmailVerified
    )
}