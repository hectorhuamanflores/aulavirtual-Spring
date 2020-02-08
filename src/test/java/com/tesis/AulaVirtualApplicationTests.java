package com.tesis;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.test.context.junit4.SpringRunner;

import com.tesis.model.Usuario;
import com.tesis.repository.IUsuarioRepo;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AulaVirtualApplicationTests {
	
	@Autowired
	private IUsuarioRepo repo;
	
	@Autowired
	private BCryptPasswordEncoder bcrypt;
	
	@Test
	public void contextLoads() {
		
		Usuario us = new Usuario();
		 us.setIdUsuario(3);
		 us.setUsername("AL0001");
		 us.setPassword(bcrypt.encode("123"));
		 us.setEnabled(true);
		 us.setCnombre("Pedro");
		 us.setCapellido("Flores Vilca");
		 us.setNdni(46628415);

		 
		 Usuario retorno = repo.save(us);
		 assertTrue(retorno.getPassword().equalsIgnoreCase(us.getPassword()));
		 
	}

}
