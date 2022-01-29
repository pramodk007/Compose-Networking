package com.example.compose_networking.data.api

import com.example.compose_networking.data.api.model.Character
import retrofit2.http.GET

interface CharacterApi {

    @GET(ApiConstants.END_POINT)
    suspend fun getCharacters():List<Character>
}