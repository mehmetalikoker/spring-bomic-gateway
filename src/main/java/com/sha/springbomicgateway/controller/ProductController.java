package com.sha.springbomicgateway.controller;

import com.google.gson.JsonElement;
import com.sha.springbomicgateway.model.requestbody.CreateProductRequestBody;
import com.sha.springbomicgateway.model.requestbody.DeleteProductRequestBody;
import com.sha.springbomicgateway.service.product.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("gateway/product")
public class ProductController {
    @Autowired
    private IProductService productService;

    @PostMapping
    public ResponseEntity<?> saveProduct(@RequestBody CreateProductRequestBody requestBody){
        return ResponseEntity.ok(productService.saveProduct(requestBody.getProduct()));
    }

    @DeleteMapping("{productId}")
    public ResponseEntity<?> deleteProduct(@RequestBody DeleteProductRequestBody requestBody){
        productService.deleteProduct(requestBody.getProductId());

        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<?> getAllProducts(){
        return ResponseEntity.ok(productService.getAllProduct());
    }
}
