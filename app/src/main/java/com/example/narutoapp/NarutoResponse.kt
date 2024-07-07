package com.example.narutoapp

import com.google.gson.TypeAdapter
import com.google.gson.annotations.JsonAdapter
import com.google.gson.annotations.SerializedName
import com.google.gson.stream.JsonReader
import com.google.gson.stream.JsonWriter

data class NarutoResponse(

    @SerializedName("currentPage") val currentPage: Int,
    @SerializedName("pageSize") val pageSize: Int,
    @SerializedName("totalCharacters") val totalCharacters:Int,
    @SerializedName("characters") val characters: List<Narutocharacters>

){}
data class Narutocharacters(

    @SerializedName("id") val id: Int,
    @SerializedName("name") val name: String,
    @SerializedName("debut") val debut:String,
    @SerializedName("jutsu") val jutsu:String,
    @SerializedName("image") val image: Image


){}




data class Image (
    @SerializedName("url") val url: String
){}
