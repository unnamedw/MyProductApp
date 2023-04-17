package com.example.myproductapp.data.remote

import com.example.myproductapp.data.remote.dto.ProductListResponse

interface ApiService {

    suspend fun productList(): ProductListResponse

}