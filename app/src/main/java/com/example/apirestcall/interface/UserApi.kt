package com.example.apirestcall.`interface`

import com.example.apirestcall.`class`.User
import retrofit2.Response
import retrofit2.http.GET

interface UserApi {
    @GET("/users")
    suspend fun getUser() : Response<ArrayList<User>>
}