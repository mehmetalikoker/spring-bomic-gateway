package com.sha.springbomicgateway.repository;

import com.sha.springbomicgateway.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


public interface IUserRepository extends JpaRepository<User,Long> {
    Optional<User> findByUsername(String username);

    List<User> findAllUsers();
}
