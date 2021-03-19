package com.gelatotest.domain.usecase

import com.gelatotest.domain.model.PicsumPhotos
import com.gelatotest.domain.repository.PhotoRepository
import io.reactivex.Observable
import javax.inject.Inject

class PhotoUseCase @Inject constructor(
    private val photoRepository: PhotoRepository
) {
    fun getPhotoList(pageNumber: Int): Observable<List<PicsumPhotos>>{
        return photoRepository.getPhotoListRepo(pageNumber)
    }
}