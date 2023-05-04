package com.example.android.marsphotos.network

import com.squareup.moshi.Json

class MarsPhoto(val id: String, @Json(name = "img_src") val imgSrcUrl: String) {

}