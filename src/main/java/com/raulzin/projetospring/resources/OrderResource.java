package com.raulzin.projetospring.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.raulzin.projetospring.entities.Order;
import com.raulzin.projetospring.services.OrderService;

//**CONTROLADOR REST

@RestController
@RequestMapping(value = "/orders")

public class OrderResource {
	
	//dependência com a camada de serviço
	
	@Autowired
	private OrderService service;
	
	
	@GetMapping
	public ResponseEntity <List<Order>> findAll(){
		
		List <Order> list = service.findAll();
		
		return ResponseEntity.ok().body(list);
		
	}
	
	//requisição para id
	@GetMapping(value = "/{id}")
	public ResponseEntity <Order> findById( @PathVariable Long id){
		Order obj = service.findById(id);
		return ResponseEntity.ok(obj);
	}

}
