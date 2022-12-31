package com.sha.springbomicgateway.service.transaction;

import com.google.gson.JsonElement;
import com.sha.springbomicgateway.service.request.ITransactionServiceRequest;
import com.sha.springbomicgateway.utils.RetrofitHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionService implements ITransactionService{

    @Autowired
    private ITransactionServiceRequest transactionServiceRequest;

    @Override
    public JsonElement saveTransaction(JsonElement transaction){
        return RetrofitHelper.executeInBlock(transactionServiceRequest.saveTransaction(transaction));
    }

    @Override
    public void deleteTransaction(Long transactionId){
        RetrofitHelper.executeInBlock(transactionServiceRequest.deleteTransaction(transactionId));
    }
    @Override
    public List<JsonElement> getAllTransactionOfUser(Long user){
        return RetrofitHelper.executeInBlock(transactionServiceRequest.getAllTransactionsOfAuthorizedUser(user));
    }
}
