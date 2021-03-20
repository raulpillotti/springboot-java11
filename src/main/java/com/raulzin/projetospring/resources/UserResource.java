package com.raulzin.projetospring.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.raulzin.projetospring.entities.User;
import com.raulzin.projetospring.services.UserService;

//**CONTROLADOR REST

@RestController
@RequestMapping(value = "/users")

public class UserResource {
	
	//dependência com a camada de serviço
	
	@Autowired
	private UserService service;
	
	
	@GetMapping
	public ResponseEntity <List<User>> findAll(){
		
		List <User> list = service.findAll();
		
		return ResponseEntity.ok().body(list);
		
	}
	
	//requisição para id
	@GetMapping(value = "/{id}")
	public ResponseEntity <User> findById( @PathVariable Long id){
		User obj = service.findById(id);
		return ResponseEntity.ok(obj);
	}

}
