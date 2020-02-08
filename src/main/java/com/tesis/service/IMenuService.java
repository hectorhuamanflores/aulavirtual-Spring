package com.tesis.service;

import java.util.List;

import com.tesis.model.Menu;


public interface IMenuService extends ICRUD<Menu>{
	
	List<Menu> listarMenuPorUsuario(String nombre);
}
