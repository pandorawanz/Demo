package com.wanz.cart;

import com.wanz.cart.model.*;
import com.wanz.product.model.Product;
import org.junit.Test;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.junit.Assert.assertEquals;

public class CartControllerTest {

    private CartController cartController = new CartController();
    private Product[] products;

    @Test
    public void shouldGetCartSuccessfully() {
        ResponseEntity<GetCartResponse> response = cartController.getCart("123");

        assertEquals(HttpStatus.OK, response.getStatusCode());
    }

    @Test
    public void shouldListCartSuccessfully() {
        ResponseEntity<ListCartResponse> response = cartController.listCart();

        assertEquals(HttpStatus.OK, response.getStatusCode());
    }

    @Test
    public void shouldCreateCartSuccessfully() {
        ResponseEntity<CreateCartResponse> response = cartController.createCart(new CreateCartRequest("123", "default", products));

        assertEquals(HttpStatus.CREATED, response.getStatusCode());
    }

    @Test
    public void shouldUpdateCartSuccessfully() {
        ResponseEntity<UpdateCartResponse> response = cartController.updateCart("123", new UpdateCartRequest("default", products));

        assertEquals(HttpStatus.OK, response.getStatusCode());
    }

    @Test
    public void shouldDeleteCartSuccessfully() {
        ResponseEntity<Object> response = cartController.deleteCart("123");

        assertEquals(HttpStatus.OK, response.getStatusCode());
    }
}
