package com.wanz.product;

import com.wanz.product.model.Product;
import com.wanz.product.model.ProductDao;
import com.wanz.product.model.api.*;
import com.wanz.product.validator.CreateProductRequestValidator;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    private ProductDao productDao;
    private CreateProductRequestValidator createProductRequestValidator;

    // productDao和createProductRequestValidator的依赖注入
    public ProductController(ProductDao productDao, CreateProductRequestValidator createProductRequestValidator) {
        this.createProductRequestValidator = createProductRequestValidator;
        this.productDao = productDao;
    }

    /*
     * Get product
     */
    @GetMapping("/products/{productId}")
    ResponseEntity<GetProductResponse> getProduct(@PathVariable int productId) {
        // 执行数据处理方法
        Product product = productDao.get(productId);
        return new ResponseEntity<>(new GetProductResponse(product), HttpStatus.OK);
    }

    /*
     * Get product list
     */
    @GetMapping("/products")
    ResponseEntity<ListProductResponse> listProduct() {
        List<Product> listProduct = productDao.list();
        return new ResponseEntity<>(new ListProductResponse(listProduct), HttpStatus.OK);
    }

    /*
     * Create product
     */
    @PostMapping("/products")
    ResponseEntity<CreateProductResponse> createProduct(@RequestBody CreateProductRequest createProductRequest) {
        //实现
        boolean validate = createProductRequestValidator.validate(createProductRequest);
        Product product = productDao.create(createProductRequest);
        return new ResponseEntity<>(new CreateProductResponse(product), HttpStatus.CREATED);
    }

    /*
     * Update product
     */
    @PutMapping("/products/{productID}")
    ResponseEntity<UpdateProductResponse> updateProduct(@PathVariable int productID, @RequestBody UpdateProductRequest updateProductRequest) {
        Product product = productDao.update(productID, updateProductRequest);
        return new ResponseEntity<>(new UpdateProductResponse(product), HttpStatus.OK);
    }

    /*
     * Delete product
     */
    @DeleteMapping("/products/{productID}")
    ResponseEntity<Object> deleteProduct(@PathVariable int productID) {
        productDao.delete(productID);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
