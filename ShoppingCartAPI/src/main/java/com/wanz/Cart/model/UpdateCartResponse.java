package com.wanz.cart.model;

public class UpdateCartResponse {
    private CartItem cartItem;

    public UpdateCartResponse() {}

    public UpdateCartResponse(CartItem cartItem) {
        this.cartItem = cartItem;
    }

    public void setCartItem(CartItem cartItem) {
        this.cartItem = cartItem;
    }

    public CartItem getCartItem() {
        return cartItem;
    }

}
