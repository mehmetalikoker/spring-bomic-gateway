package com.sha.springbomicgateway.model.requestbody;

import com.google.gson.JsonElement;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateProductRequestBody {
    public JsonElement product;
}
