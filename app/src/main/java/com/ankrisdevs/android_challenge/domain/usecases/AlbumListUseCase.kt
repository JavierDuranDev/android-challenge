package com.ankrisdevs.android_challenge.domain.usecases

import com.ankrisdevs.android_challenge.domain.entities.AlbumEntity
import javax.inject.Inject

class AlbumListUseCase @Inject constructor() {
    suspend operator fun invoke(accessToken: String) : List<AlbumEntity>? {
        return emptyList()
    }
}