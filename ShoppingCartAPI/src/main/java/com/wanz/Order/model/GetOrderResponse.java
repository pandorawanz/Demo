package com.wanz.order.model;

public class GetOrderResponse {
    private Order order;

    public GetOrderResponse() {}

    public GetOrderResponse(Order order) {
        this.order = order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Order getOrder() {
        return order;
    }
}
