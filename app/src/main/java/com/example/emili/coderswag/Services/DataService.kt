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
            Product("Devslopes Black Beanir", "56dol", "hat4")
    )

    val hoodies = listOf(
            Product("Blue hoadie", "28dol", "hoodia1"),
            Product("Red hoadie", "28dol", "hoodia2"),
            Product("Black hoadie", "28dol", "hoodia3"),
            Product("hoadie", "28dol", "hoodia4")
    )

    val shirts = listOf(
            Product("Blue shirt", "10dol", "shirt1"),
            Product("Shirt", "101dol", "shirt2"),
            Product("Green shirt", "210dol", "shirt3"),
            Product("Black shirt", "20dol", "shirt4"),
            Product("Red shirt", "34dol", "shirt5")
    )

}