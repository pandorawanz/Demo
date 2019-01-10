package com.wanz.Cart.model;

import com.wanz.Product.model.Product;

public class CreateCartRequest {
    private String id;
    private String name;
    private Product[] products;

    public CreateCartRequest(String id, String name, Product[] products) {
        this.id = id;
        this.name = name;
        this.products = products;
    }

    public Product[] getProducts() {
        return products;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }
}
