package com.tesis.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tesis.model.Rol;
import com.tesis.repository.IRolesRepository;
@Service
public class RolesService implements IRolesService{
	
    @Autowired
	private IRolesRepository rolesRepo;
    
	@Override
	public List<Rol> listarRoles() {
		// TODO Auto-generated method stub
		return rolesRepo.findAll();
	}

}
