package com.example.compose_networking.data.repository

import com.example.compose_networking.data.api.CharacterApi
import com.example.compose_networking.data.api.model.Character
import javax.inject.Inject

class CharacterRepository @Inject constructor(
    private val characterApi: CharacterApi
) {
    suspend fun getCharacters(): List<Character> {
        return characterApi.getCharacters()
    }
}