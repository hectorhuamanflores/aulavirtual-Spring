package com.tesis.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tesis.model.Rol;
import com.tesis.service.IRolesService;

@RestController
public class RolesController {
	
	@Autowired
	private IRolesService rolservice;
	
	@GetMapping("/roles")
	public Map<String, Object> listar(){
		Map<String, Object> result = new HashMap<String, Object>();
		result.put("data", rolservice.listarRoles());
		return result;
	}
	
}
