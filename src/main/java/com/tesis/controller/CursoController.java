package com.tesis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.tesis.service.ICursoService;

@RestController
public class CursoController {
	
	@Autowired
	private ICursoService cursoservice;
	
	
}
