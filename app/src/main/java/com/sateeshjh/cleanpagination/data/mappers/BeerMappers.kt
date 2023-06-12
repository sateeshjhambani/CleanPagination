package com.sateeshjh.cleanpagination.data.mappers

import com.sateeshjh.cleanpagination.data.local.BeerEntity
import com.sateeshjh.cleanpagination.data.remote.BeerDto
import com.sateeshjh.cleanpagination.domain.Beer

fun BeerDto.toBeerEntity(): BeerEntity {
    return BeerEntity(
        id = id,
        name = name,
        tagline = tagline,
        description = description,
        firstBrewed = first_brewed,
        imageUrl = image_url,
    )
}

fun BeerEntity.toBeer(): Beer {
    return Beer(
        id = id,
        name = name,
        tagline = tagline,
        description = description,
        firstBrewed = firstBrewed,
        imageUrl = imageUrl,
    )
}