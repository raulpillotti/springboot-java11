package com.raulzin.projetospring.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.raulzin.projetospring.entities.User;

@RestController
@RequestMapping(value = "/users")

public class UserResource {
	
	//controlador rest que responde no caminho users (User)
	
	@GetMapping
	public ResponseEntity<User> findAll(){
		
		User u = new User(1L, "Raul", "raul@gmail.com", "999999999", "12345");
		
		return ResponseEntity.ok().body(u);
		
	}

}
