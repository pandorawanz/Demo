package com.wanz.Cart.model;

public class CreateCartResponse {
    private Cart cart;

    public CreateCartResponse() {}

    public CreateCartResponse(Cart cart) {
        this.cart = cart;
    }

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }
}
