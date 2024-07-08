package com.example.narutoapp

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface ApiServiceNaruto {

    @GET("character?page=1&limit=2500")
    suspend fun findAll() : Response<RecipeResponse>

    @GET("{name}")
    suspend fun findCharacterByName(@Path("name") query: String) : NarutoResponse

    @GET("{character}")
    suspend fun getCharacterById(@Path("character") id: Int) : Narutocharacters
}




/*@GET("recipes/?limit=0")
suspend fun findAll() : Response<RecipeResponse>

@GET("recipes/search")
suspend fun findAllByName(@Query("q") query:String) : Response<RecipeResponse>

@GET("recipes/{id}")
suspend fun findById(@Path("id") id:Int) : Response<Recipe>

https://narutodb.xyz/api/character/1


character?page=1&limit=2500


*/