package com.themovie.app.movieapp.data

import androidx.room.TypeConverter
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.themovie.app.movieapp.data.source.local.LocalImdb

class Converters {
    @TypeConverter
    fun fromImdbObject(address: LocalImdb): String {
        return Gson().toJson(address)
    }

    @TypeConverter
    fun toImdbObject(value: String): LocalImdb {
        val type = object : TypeToken<LocalImdb>() {}.type
        return Gson().fromJson(value, type)
    }

    @TypeConverter
    fun fromStringList(list: List<String>): String {
        return Gson().toJson(list)
    }

    @TypeConverter
    fun toStringList(json: String): List<String> {
        val type = object : TypeToken<List<String>>() {}.type
        return Gson().fromJson(json, type)
    }

}