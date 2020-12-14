package com.surelabs.news

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.surelabs.news.dataclass.ResponseNewsList
import retrofit2.Call
import retrofit2.Response

class MainActivity : AppCompatActivity() {


    lateinit var rc : RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rc= findViewById(R.id.rcv)

        ambilBerita()
    }

    private fun ambilBerita() {
        //panggil retrofit atau konfigurasi network nya
        Config.getService().selectBerita()
            .enqueue(object : retrofit2.Callback<ResponseNewsList>{

                override fun onFailure(call: Call<ResponseNewsList>, t: Throwable) {

                }

                override fun onResponse(
                    call: Call<ResponseNewsList>,
                    response: Response<ResponseNewsList>
                ) {
                    if(response.isSuccessful){
                        // ini berarti koneksi atau request yang dibuat berhasil
                        // response code (200)

                    }else{
                        // ini koneksi / response gagal
                        // response code non 200

                    }
                }

            })
    }

}