package com.example.lab_week_06

import android.widget.*
interface ImageLoader {
    fun loadImage(imageUrl: String, imageView: ImageView)
}