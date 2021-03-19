package com.gelatotest.data.remote

import com.gelatotest.data.entity.PicsumPhotosEntity
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Query

interface PhotoListService {
    @GET("/v2/list")
    fun getPhotosListWithPageNumber(@Query("page") pageNumber: Int)
            : Observable<List<PicsumPhotosEntity>>
}