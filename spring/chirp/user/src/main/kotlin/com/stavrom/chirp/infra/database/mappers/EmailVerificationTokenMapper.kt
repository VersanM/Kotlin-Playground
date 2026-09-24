package com.stavrom.chirp.infra.database.mappers

import com.stavrom.chirp.domain.model.EmailVerificationToken
import com.stavrom.chirp.infra.database.entities.EmailVerificationTokenEntity

fun EmailVerificationTokenEntity.toEmailVerificationToken(): EmailVerificationToken {
    return EmailVerificationToken(
        id = id,
        token = token,
        user = user.toUser(),
    )
}