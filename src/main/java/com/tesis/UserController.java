package com.tesis;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.oauth2.provider.token.ConsumerTokenServices;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tesis.model.Usuario;
import com.tesis.repository.IUsuarioRepo;

@RestController
@RequestMapping("/usuarios")
public class UserController {

	@Resource(name = "tokenServices")
	private ConsumerTokenServices tokenServices;
	
	@Autowired
	private IUsuarioRepo repo;
	
	
	@GetMapping(value = "/anular/{tokenId:.*}")
	public void revokeToken(@PathVariable("tokenId") String token) {
		tokenServices.revokeToken(token);				
	}
	
	@GetMapping("/datos/{username}")
	public Map<String, Object> listar(@PathVariable("username") String username){
		Map<String, Object> result = new HashMap<String, Object>();
		Usuario user = repo.findOneByUsername(username);
		result.put("data", user);
		return result;
	}
	
	@GetMapping("/datos/")
	public Map<String, Object> listarAll(){
		Map<String, Object> result = new HashMap<String, Object>();
		List<Usuario> user = (List<Usuario>) repo.findAll();
		result.put("data", user);
		return result;
	}
}
