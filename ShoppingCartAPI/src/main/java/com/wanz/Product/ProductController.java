package com.wanz.product;

import com.wanz.product.model.*;
import com.wanz.product.validator.CreateProductRequestValidator;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductController {

    private CreateProductRequestValidator createProductRequestValidator;

    public ProductController(CreateProductRequestValidator createProductRequestValidator) {
        this.createProductRequestValidator = createProductRequestValidator;
    }

    /*
     * Get product
     */
    @GetMapping("/products/{productID}")
    ResponseEntity<GetProductResponse> getProduct(@PathVariable String productID) {
        return new ResponseEntity<>(new GetProductResponse(), HttpStatus.OK);
    }

    /*
     * Get product list
     */
    @GetMapping("/products")
    ResponseEntity<ListProductResponse> listProduct() {
        return new ResponseEntity<>(new ListProductResponse(), HttpStatus.OK);
    }

    /*
     * Create product
     */
    @PostMapping("/products")
    ResponseEntity<CreateProductResponse> createProduct(@RequestBody CreateProductRequest createProductRequest) {
        //实现
        boolean validate = createProductRequestValidator.validate(createProductRequest);
        return new ResponseEntity<>(new CreateProductResponse(), HttpStatus.CREATED);
    }

    /*
     * Update product
     */
    @PutMapping("/products/{productID}")
    ResponseEntity<UpdateProductResponse> updateProduct(@PathVariable String productID, @RequestBody UpdateProductRequest updateProductRequest) {
        return new ResponseEntity<>(new UpdateProductResponse(), HttpStatus.OK);
    }

    /*
     * Delete product
     */
    @DeleteMapping("/products/{productID}")
    ResponseEntity<Object> deleteProduct(@PathVariable String productID) {
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
