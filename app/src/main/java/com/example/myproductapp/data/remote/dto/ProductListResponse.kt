package com.example.myproductapp.data.remote.dto

data class ProductListResponse(
    val limit: Int,
    val productApiModels: List<ProductApiModel>,
    val skip: Int,
    val total: Int
) {
    data class ProductApiModel(
        val brand: String,
        val category: String,
        val description: String,
        val discountPercentage: Double,
        val id: Int,
        val images: List<String>,
        val price: Int,
        val rating: Double,
        val stock: Int,
        val thumbnail: String,
        val title: String
    )
}