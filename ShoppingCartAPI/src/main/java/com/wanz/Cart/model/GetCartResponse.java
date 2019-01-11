package com.wanz.cart.model;

public class GetCartResponse {
    private Cart cart;

    public GetCartResponse() {}

    public GetCartResponse(Cart cart) {
        this.cart = cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }

    public Cart getCart() {
        return cart;
    }
}
