package com.wanz.cart.model;

import com.wanz.product.model.Product;

public class UpdateCartRequest {
    private int quantity;

    public UpdateCartRequest(int user_id, int product_id, int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
