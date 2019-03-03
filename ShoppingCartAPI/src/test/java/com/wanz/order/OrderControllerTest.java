package com.wanz.order;

import com.wanz.cart.model.CartItem;
import com.wanz.order.model.CreateOrderRequest;
import com.wanz.order.model.CreateOrderResponse;
import com.wanz.order.model.GetOrderResponse;
import com.wanz.order.model.ListOrderResponse;
import org.junit.Test;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.junit.Assert.assertEquals;

public class OrderControllerTest {
/*
    private OrderController orderController = new OrderController();

    @Test
    public void shouldGetOrderSuccessfully() {
        ResponseEntity<GetOrderResponse> response = orderController.getOrder("123");

        assertEquals(HttpStatus.OK, response.getStatusCode());
    }

    @Test
    public void shouldListOrderSuccessfully() {
        ResponseEntity<ListOrderResponse> response = orderController.listOrder();

        assertEquals(HttpStatus.OK, response.getStatusCode());
    }

    @Test
    public void shouldCreateOrderSuccessfully() {
        ResponseEntity<CreateOrderResponse> response = orderController.createOrder(new CreateOrderRequest("123", new CartItem()));

        assertEquals(HttpStatus.CREATED, response.getStatusCode());
    }

    @Test
    public void shouldDeleteOrderSuccessfully() {
        ResponseEntity<Object> response = orderController.deleteOrder("123");

        assertEquals(HttpStatus.OK, response.getStatusCode());
    }
    */
}
