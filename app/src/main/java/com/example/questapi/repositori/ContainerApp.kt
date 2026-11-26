package com.example.questapi.repositori
import android.app.Application
import com.example.questapi.apiservice.ServiceApiSiswa
import com.jakewharton.retrofit2.converter.kotlinx.serialization
.asConverterFactory
import kotlinx.serialization.json.Json
import okhttp3.MediaType.Companion.toMediaType
import retrofit2.Retrofit
import kotlin.getValue

interface ContainerApp {
    val repositoryDataSiswa : RepositoryDataSiswa
}
