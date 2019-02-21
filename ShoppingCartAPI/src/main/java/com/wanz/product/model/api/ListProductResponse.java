package com.wanz.product.model.api;

import com.wanz.product.model.Product;

import java.util.List;

public class ListProductResponse {
    private List<Product> listProduct;

    public ListProductResponse() {}

    public ListProductResponse(List<Product> listProduct) {
        this.listProduct = listProduct;
    }

    public List<Product> getListProduct() {
        return listProduct;
    }

    public void setListProduct(List<Product> listProduct) {
        this.listProduct = listProduct;
    }
}
