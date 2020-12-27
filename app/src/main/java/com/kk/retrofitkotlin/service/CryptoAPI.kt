package com.kk.retrofitkotlin.service

import com.kk.retrofitkotlin.model.CryptoModel
import io.reactivex.Observable
import retrofit2.Call
import retrofit2.http.GET

interface CryptoAPI {

    //https://api.nomics.com/v1/prices?key=9ee69cb23543c70e09ee02df06f808aa
    //API Key: 9ee69cb23543c70e09ee02df06f808aa

    @GET("prices?key=9ee69cb23543c70e09ee02df06f808aa")
    fun getData(): Observable<List<CryptoModel>>
}