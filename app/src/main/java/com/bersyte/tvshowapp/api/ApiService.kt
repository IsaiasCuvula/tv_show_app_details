package com.bersyte.tvshowapp.api

import com.bersyte.tvshowapp.helper.Constants
import com.bersyte.tvshowapp.models.TvShowResponse
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {

    @GET(Constants.END_POINT)
    suspend fun getTvShows():Response<TvShowResponse>

}