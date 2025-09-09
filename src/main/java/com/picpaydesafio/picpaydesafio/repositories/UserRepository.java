package com.picpaydesafio.picpaydesafio.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.picpaydesafio.picpaydesafio.domain.user.User;

public interface UserRepository  extends JpaRepository<User, Long> {

    Optional<User> findUserByDocument(String document);
    Optional<User> findUserById(String id);

}
