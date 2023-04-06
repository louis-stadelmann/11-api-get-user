package com.example.apirestcall.services

import com.example.apirestcall.`class`.User
import retrofit2.Response
import retrofit2.http.GET

interface UserService {
    @GET("/users")
    suspend fun getUsers() : Response<User>
}