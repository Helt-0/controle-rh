package com.helt0.userdept.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.helt0.userdept.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
