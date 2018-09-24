package com.example.emili.coderswag.Services

import com.example.emili.coderswag.Model.Category
import com.example.emili.coderswag.Model.Product

object DataService {
    val categories = listOf(
            Category("SHIRTS", "shirtimage"),
            Category("HOODIES", "hoodieimage"),
            Category("HATS", "hatimage"),
            Category("DIGITAL", "digitalgoodsimage"),
            Category("SHIRTS", "shirtimage"),
            Category("HOODIES", "hoodieimage"),
            Category("HATS", "hatimage"),
            Category("DIGITAL", "digitalgoodsimage"),
            Category("SHIRTS", "shirtimage"),
            Category("HOODIES", "hoodieimage"),
            Category("HATS", "hatimage"),
            Category("DIGITAL", "digitalgoodsimage")
    )

    val hats = listOf(
            Product("Devslopes Beanie", "18dol", "hat1"),
            Product("Devslopes Blue", "13dol", "hat2"),
            Product("Devslopes Red", "111dol", "hat3"),
            Product("Devslopes Black Beanir", "56dol", "hat4"),
            Product("Devslopes Beanie", "18dol", "hat1"),
            Product("Devslopes Blue", "13dol", "hat2"),
            Product("Devslopes Red", "111dol", "hat3"),
            Product("Devslopes Black Beanir", "56dol", "hat4"),
            Product("Devslopes Beanie", "18dol", "hat1"),
            Product("Devslopes Blue", "13dol", "hat2"),
            Product("Devslopes Red", "111dol", "hat3"),
            Product("Devslopes Black Beanir", "56dol", "hat4")
    )

    val hoodies = listOf(
            Product("Blue hoadie", "28dol", "hoodie1"),
            Product("Red hoadie", "28dol", "hoodie2"),
            Product("Black hoadie", "28dol", "hoodie3"),
            Product("hoadie", "28dol", "hoodie4"),
            Product("Blue hoadie", "28dol", "hoodie1"),
            Product("Red hoadie", "28dol", "hoodie2"),
            Product("Black hoadie", "28dol", "hoodie3"),
            Product("hoadie", "28dol", "hoodie4"),
            Product("Blue hoadie", "28dol", "hoodie1"),
            Product("Red hoadie", "28dol", "hoodie2"),
            Product("Black hoadie", "28dol", "hoodie3"),
            Product("hoadie", "28dol", "hoodie4")
    )

    val shirts = listOf(
            Product("Blue shirt", "10dol", "shirt1"),
            Product("Shirt", "101dol", "shirt2"),
            Product("Green shirt", "210dol", "shirt3"),
            Product("Black shirt", "20dol", "shirt4"),
            Product("Red shirt", "34dol", "shirt5"),
            Product("Blue shirt", "10dol", "shirt1"),
            Product("Shirt", "101dol", "shirt2"),
            Product("Green shirt", "210dol", "shirt3"),
            Product("Black shirt", "20dol", "shirt4"),
            Product("Red shirt", "34dol", "shirt5"),
            Product("Blue shirt", "10dol", "shirt1"),
            Product("Shirt", "101dol", "shirt2"),
            Product("Green shirt", "210dol", "shirt3"),
            Product("Black shirt", "20dol", "shirt4"),
            Product("Red shirt", "34dol", "shirt5")
    )

    val digitalGoodies = listOf<Product>()

    fun getProduct(category: String) : List<Product>{
        return when (category){
            "SHIRTS" -> shirts
            "HATS" -> hats
            "HOODIES" -> hoodies
            else -> digitalGoodies
        }
    }

}