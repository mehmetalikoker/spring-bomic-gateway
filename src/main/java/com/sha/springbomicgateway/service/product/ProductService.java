package com.sha.springbomicgateway.service.product;

import com.google.gson.JsonElement;
import com.sha.springbomicgateway.service.product.IProductService;
import com.sha.springbomicgateway.service.request.IProductServiceRequest;
import com.sha.springbomicgateway.utils.RetrofitHelper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Slf4j
@Service
public class ProductService implements IProductService {

    @Autowired
    private IProductServiceRequest productServiceRequest;

    @Override
    public JsonElement saveProduct(JsonElement requestBody) {
        return RetrofitHelper.executeInBlock(productServiceRequest.saveProduct(requestBody));
    }

    @Override
    public void deleteProduct(Long productId) {
        RetrofitHelper.executeInBlock(productServiceRequest.deleteProduct(productId));
    }

    @Override
    public List<JsonElement> getAllProduct() {
        return RetrofitHelper.executeInBlock(productServiceRequest.getAllProduct());
    }
}
