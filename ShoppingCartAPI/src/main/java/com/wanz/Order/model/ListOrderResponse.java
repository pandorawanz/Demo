package com.wanz.Order.model;

import java.util.List;

public class ListOrderResponse {
    private List<Order> listOrder;

    public ListOrderResponse() {}

    public ListOrderResponse(List<Order> listOrder) {
        this.listOrder = listOrder;
    }

    public void setListOrder(List<Order> listOrder) {
        this.listOrder = listOrder;
    }

    public List<Order> getListOrder() {
        return listOrder;
    }
}
