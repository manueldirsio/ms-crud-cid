package com.dirsio.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dirsio.demo.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Integer> {

}
