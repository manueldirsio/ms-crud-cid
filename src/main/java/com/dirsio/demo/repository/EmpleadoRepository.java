package com.dirsio.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dirsio.demo.entity.EmpleadoEntity;

public interface EmpleadoRepository extends JpaRepository<EmpleadoEntity, Integer> {

}
