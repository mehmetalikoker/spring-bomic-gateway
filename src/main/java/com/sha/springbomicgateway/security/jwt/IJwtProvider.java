package com.sha.springbomicgateway.security.jwt;

import com.sha.springbomicgateway.security.UserPrincipal;
import org.springframework.security.core.Authentication;

import javax.servlet.http.HttpServletRequest;

public interface IJwtProvider {
    Authentication getAuthentication(HttpServletRequest request);

    boolean validationToken(HttpServletRequest request);

     String generateToken(UserPrincipal authentication);
}
