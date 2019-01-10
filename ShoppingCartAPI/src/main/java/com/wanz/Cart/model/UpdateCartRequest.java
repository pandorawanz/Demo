package com.wanz.Cart.model;

import com.wanz.Product.model.Product;

public class UpdateCartRequest {
    private String name;
    private Product[] products;

    public UpdateCartRequest(String name, Product[] products) {
        this.name = name;
        this.products = products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Product[] getProducts() {
        return products;
    }

    public String getName() {
        return name;
    }
}
