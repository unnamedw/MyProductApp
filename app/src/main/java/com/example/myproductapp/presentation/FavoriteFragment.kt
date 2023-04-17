package com.example.myproductapp.presentation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.myproductapp.R

class FavoriteFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_favorite, container, false)
    }

    companion object {

        @JvmStatic
        fun newInstance() =
            FavoriteFragment().apply {
                arguments = Bundle().apply {
                }
            }
    }
}