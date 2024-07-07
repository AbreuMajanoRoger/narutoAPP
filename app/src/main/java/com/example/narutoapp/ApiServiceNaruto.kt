package com.example.narutoapp

import retrofit2.http.GET
import retrofit2.http.Path

interface ApiServiceNaruto {

    @GET("{name}")
    suspend fun findCharacterByName(@Path("name") query: String) : NarutoResponse

    @GET("{character-id}")
    suspend fun getCharacterById(@Path("character-id") id: Int) : Narutocharacters
}


