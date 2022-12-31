package com.sha.springbomicgateway.service.transaction;

import com.google.gson.JsonElement;

import java.util.List;

public interface ITransactionService {

    JsonElement saveTransaction(JsonElement transaction);

    void deleteTransaction(Long transactionId);

    List<JsonElement> getAllTransactionOfUser(Long user);
}
