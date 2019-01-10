package com.wanz.Cart;

import com.wanz.Cart.model.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class CartController {

    @GetMapping("/cart/{cartID}")
    ResponseEntity<GetCartResponse> getCart(@PathVariable String cartID) {
        return new ResponseEntity<>(new GetCartResponse(), HttpStatus.OK);
    }

    @GetMapping("/cart")
    ResponseEntity<ListCartResponse> listCart() {
        return new ResponseEntity<>(new ListCartResponse(), HttpStatus.OK);
    }

    @PostMapping("/cart")
    ResponseEntity<CreateCartResponse> createCart(@RequestBody CreateCartRequest createCartRequest) {
        return new ResponseEntity<>(new CreateCartResponse(),HttpStatus.CREATED);
    }

    @PutMapping("/cart/{cartID}")
    ResponseEntity<UpdateCartResponse> updateCart(@PathVariable String cartID, @RequestBody UpdateCartRequest updateCartRequest) {
        return new ResponseEntity<UpdateCartResponse>(new UpdateCartResponse(), HttpStatus.OK);
    }

    @DeleteMapping("/cart/{cartID}")
    ResponseEntity<Object> deleteCart(@PathVariable String cartID) {
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
