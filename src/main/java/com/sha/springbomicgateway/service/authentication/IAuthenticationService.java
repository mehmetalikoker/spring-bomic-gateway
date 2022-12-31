package com.sha.springbomicgateway.service.authentication;

import com.sha.springbomicgateway.model.User;

public interface IAuthenticationService {
    String signInAndReturnJWT(User signInRequest);
}
