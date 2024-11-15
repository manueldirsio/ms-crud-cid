package com.dirsio.demo.controller;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.ResponseEntity;

import com.dirsio.demo.entity.EmpleadoEntity;
import com.dirsio.demo.service.EmpleadoService;

public class EmpleadoControllerTest {

	private EmpleadoController empleadoController;
	@Mock
	private EmpleadoService empleadoService;

	@BeforeEach
	public void init() {
		MockitoAnnotations.openMocks(this);
		this.empleadoController = new EmpleadoController(empleadoService);
	}

	@Test
	public void createEmpleadoTest() {
		EmpleadoEntity empleadoEntity = new EmpleadoEntity();

		when(this.empleadoService.createEmpleado(empleadoEntity)).thenReturn(empleadoEntity);
		ResponseEntity<EmpleadoEntity> response = this.empleadoController.createEmpleado(empleadoEntity);
		assertNotNull(response);
	}

}
