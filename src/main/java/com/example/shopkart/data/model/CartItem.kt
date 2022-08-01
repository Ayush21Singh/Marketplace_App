package com.example.shopkart.data.model

/**
 * Created By Ayush
 */

/**
 * Represents an individual cart item in Cart.
 */
data class CartItem(
    var userId: String? = "",
    var productOwnerId: String = "",
    var productId: String = "",
    var title: String = "",
    var price: String = "",
    var image: String = "",
    var cart_quantity: String = "",
    var stock_quantity: String = "",
    var id: String = "",
)