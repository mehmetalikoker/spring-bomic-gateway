package com.sha.springbomicgateway.service.user;

import com.sha.springbomicgateway.model.User;

import java.util.List;
import java.util.Optional;

public interface IUserService {
    Optional<User> findByUsername(String username);

    List<User> findAllUsers();
}
