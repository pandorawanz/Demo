package com.wanz.order.model;

import com.wanz.cart.model.Cart;

public class CreateOrderRequest {
    private String id;
    private Cart cart;

    public CreateOrderRequest(String id, Cart cart) {
        this.id = id;
        this.cart = cart;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }

    public Cart getCart() {
        return cart;
    }

    public String getId() {
        return id;
    }
}
