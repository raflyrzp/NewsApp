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
import com.example.newsapp.databinding.FragmentPopularBinding

class PopularFragment : Fragment() {

    private lateinit var binding :FragmentPopularBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding=FragmentPopularBinding.inflate(layoutInflater)
        binding.rvPopular.apply {
            layoutManager = LinearLayoutManager(activity)
            adapter = NewsAdapter(DataNews.dataPopularNews)
        }

        bindNewHeadline(binding.newsHeadline, 0)
        return binding.root
    }
}