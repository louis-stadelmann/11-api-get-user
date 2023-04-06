package com.example.apirestcall.`interface`

import com.example.apirestcall.`class`.User
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface UserApi {
    @GET("/users")
    suspend fun getUsers() : Response<ArrayList<User>>

    @GET("/users/{id}")
    suspend fun getUser(@Path("id") numero: String) : Response<User>
}