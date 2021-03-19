package com.gelatotest.domain.model

data class PicsumPhotos(
    val photoId: String,
    val author: String,
    val width: Int,
    val height: Int,
    val url: String,
    val downloadUrl: String
)