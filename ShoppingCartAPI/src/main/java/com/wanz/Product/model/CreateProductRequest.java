package com.wanz.Product.model;

public class CreateProductRequest {
    private String id;
    private String name;
    private String description;
    private long price;

    public CreateProductRequest(String id, String name, String desctiption, long price) {
        this.id = id;
        this.name = name;
        this.description = desctiption;
        this.price = price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
}
