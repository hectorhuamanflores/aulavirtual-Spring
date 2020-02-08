package com.tesis.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tesis.model.Usuario;

public interface IUsuarioRepo extends JpaRepository<Usuario, Integer>{

	Usuario findOneByUsername(String username);
}
