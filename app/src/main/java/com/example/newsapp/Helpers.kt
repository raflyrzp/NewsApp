package com.example.newsapp

import android.content.Intent
import com.example.newsapp.data.DataNews
import com.example.newsapp.databinding.NewsHeadlineBinding

fun bindNewHeadline(binding: NewsHeadlineBinding, position: Int) {
    binding.apply {
        imgHeadline.setImageResource(DataNews.photoHeadline[position])
        tvTitleHeadline.text = DataNews.titleHeadline[position]
        tvDescHeadline.text = DataNews.contentHeadline[position]
        tvDateHeadline.text = DataNews.dateHeadline[position]
        tvAuthorHeadline.text = DataNews.authorHeadline[position]
    }

}