package com.surelabs.news.dataclass

import com.google.gson.annotations.SerializedName

data class ResponseNewsList(

	@field:SerializedName("data")
	val data: List<DataItem?>? = null,

	@field:SerializedName("response")
	val response: String? = null,

	@field:SerializedName("status")
	val status: Int? = null
)

data class DataItem(

	@field:SerializedName("tanggal")
	val tanggal: String? = null,

	@field:SerializedName("judul")
	val judul: String? = null,

	@field:SerializedName("id_berita")
	val idBerita: String? = null,

	@field:SerializedName("gambar")
	val gambar: String? = null,

	@field:SerializedName("isi")
	val isi: String? = null
)
