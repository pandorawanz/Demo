package com.wanz.product.validator;

import com.wanz.product.model.api.CreateProductRequest;
import org.springframework.stereotype.Component;

@Component
public class CreateProductRequestValidator {

    public boolean validate(CreateProductRequest createProductRequest) {
        if (createProductRequest.getPrice()<0)
            return false;
        if (createProductRequest.getName().length()<=0)
            return false;
        return true;
    }
}
