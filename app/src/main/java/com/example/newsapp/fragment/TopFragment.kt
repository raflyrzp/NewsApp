package com.example.newsapp.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.newsapp.R
import com.example.newsapp.adapter.NewsAdapter
import com.example.newsapp.bindNewHeadline
import com.example.newsapp.data.DataNews
import com.example.newsapp.databinding.FragmentTopBinding

class TopFragment : Fragment() {

    private lateinit var binding : FragmentTopBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentTopBinding.inflate(layoutInflater)
        binding.rvTop.apply {
            layoutManager = LinearLayoutManager(activity)
            adapter = NewsAdapter(DataNews.dataTopNews)
        }

        bindNewHeadline(binding.newsHeadline, 0)
        return binding.root
    }
}