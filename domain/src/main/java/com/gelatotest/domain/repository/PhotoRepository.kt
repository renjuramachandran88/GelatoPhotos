package com.gelatotest.domain.repository

import com.gelatotest.domain.model.PicsumPhotos
import io.reactivex.Observable

interface PhotoRepository{
    fun getPhotoListRepo(pageNumber: Int): Observable<List<PicsumPhotos>>
}