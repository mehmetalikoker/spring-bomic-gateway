package com.sha.springbomicgateway.utils;

import com.google.gson.JsonElement;
import lombok.extern.slf4j.Slf4j;
import retrofit2.Call;
import retrofit2.Response;

@Slf4j
public class RetrofitHelper {
    public static <T> T executeInBlock(Call<T> request){
        try {
            Response<T> response = request.execute();

            if (!response.isSuccessful()) {
                // TODO response header issucess false
                log.error("Request get error reason:{} and statusCode{}",response.errorBody().string(),response.code());
            }

            return response.body();

        } catch (Exception ex) {

            throw new RuntimeException(ex.getCause());

        }
    }
}
