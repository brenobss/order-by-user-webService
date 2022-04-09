package com.webservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webservice.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
}
