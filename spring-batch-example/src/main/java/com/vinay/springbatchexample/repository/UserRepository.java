package com.vinay.springbatchexample.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vinay.springbatchexample.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

}
