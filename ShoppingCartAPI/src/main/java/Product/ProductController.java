package Product;

import Product.model.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.xml.ws.Response;

@RestController
public class ProductController {

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
