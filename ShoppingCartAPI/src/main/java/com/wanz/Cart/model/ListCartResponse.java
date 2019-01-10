package com.wanz.Cart.model;

import java.util.List;

public class ListCartResponse {
    private List<Cart> listCart;

    public ListCartResponse() {}

    public ListCartResponse(List<Cart> listCart) {
        this.listCart = listCart;
    }

    public List<Cart> getListCart() {
        return listCart;
    }

    public void setListCart(List<Cart> listCart) {
        this.listCart = listCart;
    }
}
