package com.example.lab_week_06

import android.content.*
import com.bumptech.glide.Glide
import android.widget.*
class GlideImageLoader(private val context: Context) : ImageLoader{
    override fun loadImage(imageUrl: String, imageView: ImageView) {
        Glide.with(context)
            .load(imageUrl)
            .centerCrop()
            .into(imageView)
    }
}
