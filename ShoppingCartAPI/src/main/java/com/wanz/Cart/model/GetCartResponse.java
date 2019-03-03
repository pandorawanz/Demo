package com.wanz.cart.model;

public class GetCartResponse {
    private CartItem cartItem;

    public GetCartResponse() {}

    public GetCartResponse(CartItem cartItem) {
        this.cartItem = cartItem;
    }

    public void setCartItem(CartItem cartItem) {
        this.cartItem = cartItem;
    }

    public CartItem getCartItem() {
        return cartItem;
    }
}
