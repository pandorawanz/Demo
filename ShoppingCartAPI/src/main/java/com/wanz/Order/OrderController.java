package com.wanz.order;

import com.wanz.order.model.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class OrderController {

    @GetMapping("/order/{orderID}")
    ResponseEntity<GetOrderResponse> getOrder(@PathVariable String orderID) {
        return new ResponseEntity<>(new GetOrderResponse(), HttpStatus.OK);
    }

    @GetMapping("/order")
    ResponseEntity<ListOrderResponse> listOrder() {
        return new ResponseEntity<>(new ListOrderResponse(), HttpStatus.OK);
    }

    @PostMapping("/order")
    ResponseEntity<CreateOrderResponse> createOrder(@RequestBody CreateOrderRequest createOrderRequest) {
        return new ResponseEntity<>(new CreateOrderResponse(), HttpStatus.CREATED);
    }

    @DeleteMapping("/order/{orderID}")
    ResponseEntity<Object> deleteOrder(@PathVariable String orderID) {
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
