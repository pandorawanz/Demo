package com.wanz.Cart.model;

import com.wanz.Product.model.Product;

public class Cart {
    private String id;
    private String name;
    private Product[] listProducts;

    public Cart(){}

    public Cart(String id, String name, Product[] listProducts) {
        this.id = id;
        this.name = name;
        this.listProducts = listProducts;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setListProducts(Product[] listProducts) {
        this.listProducts = listProducts;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Product[] getListProducts() {
        return listProducts;
    }

    public String getId() {
        return id;
    }
}
