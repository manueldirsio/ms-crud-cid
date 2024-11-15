package com.dirsio.demo.service;

import org.springframework.stereotype.Service;

import com.dirsio.demo.entity.EmpleadoEntity;
import com.dirsio.demo.repository.EmpleadoRepository;

@Service
public class EmpleadoService {

	private EmpleadoRepository empleadoRepository;

	public EmpleadoService(EmpleadoRepository empleadoRepository) {
		super();
		this.empleadoRepository = empleadoRepository;
	}

	// create
	public EmpleadoEntity createEmpleado(EmpleadoEntity empleadoEntity) {
		return this.empleadoRepository.save(empleadoEntity);
	}
}
