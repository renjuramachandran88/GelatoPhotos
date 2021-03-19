package com.gelatotest.domain.usecase

import com.gelatotest.domain.model.PicsumPhotos
import com.gelatotest.domain.repository.PhotoRepository
import io.reactivex.Observable
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.InjectMocks
import org.mockito.Mock
import org.mockito.Mockito.`when`
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class PhotoUseCaseTest {
    @InjectMocks
    private lateinit var subject: PhotoUseCase

    @Mock
    private lateinit var photoRepository: PhotoRepository

    @Mock
    private lateinit var picsumPhotos: PicsumPhotos

    @Test
    fun getPhotoList_givenPageNumber_returnsPhotosList() {
        `when`(photoRepository.getPhotoListRepo(1)).thenReturn(Observable.just(listOf(picsumPhotos)))

        val actual = subject.getPhotoList(1).test()

        actual.assertValue(listOf(picsumPhotos))
    }


}