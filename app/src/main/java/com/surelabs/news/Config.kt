package com.surelabs.news

import com.surelabs.news.dataclass.ResponseNewsList
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

object Config {

    private const val host = "http://apinews.server4111.com/index.php/"

    fun retrofitClient(): Retrofit {
        return Retrofit.Builder()
            .baseUrl(host)
            .addConverterFactory(GsonConverterFactory.create())
            .client(getOkHttp())
            .build()
    }

    private fun getOkHttp(): OkHttpClient {
        // untuk cetak response yang diberikan oleh server kedalam Log cat
        val logging = HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BASIC)
        return OkHttpClient.Builder()
            .addInterceptor(logging)
            .build()
    }

    // buat object dari retrofit client yang mengimplementasikan
    // function yang ada didalam inteface ApiService
    fun getService(): ApiService{
        return retrofitClient().create(ApiService::class.java)
    }
}

interface ApiService{

    @GET("webservice/select_berita")
    fun selectBerita(): retrofit2.Call<ResponseNewsList>

}