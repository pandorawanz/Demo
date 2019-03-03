package com.wanz.cart.model;

public class CreateCartResponse {
    private CartItem cartItem;

    public CreateCartResponse() {}

    public CreateCartResponse(CartItem cartItem) {
        this.cartItem = cartItem;
    }

    public CartItem getCartItem() {
        return cartItem;
    }

    public void setCartItem(CartItem cartItem) {
        this.cartItem = cartItem;
    }
}
