package com.raulzin.projetospring.resources;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.raulzin.projetospring.entities.Product;
import com.raulzin.projetospring.services.ProductService;

//**CONTROLADOR REST
@Resource
@RestController
@RequestMapping(value = "/products")

public class ProductResource {
	
	//dependência com a camada de serviço
	
	@Autowired
	private ProductService service;
	
	
	@GetMapping
	public ResponseEntity <List<Product>> findAll(){
		
		List <Product> list = service.findAll();
		
		return ResponseEntity.ok().body(list);
		
	}
	
	//requisição para id
	@GetMapping(value = "/{id}")
	public ResponseEntity <Product> findById( @PathVariable Long id){
		Product obj = service.findById(id);
		return ResponseEntity.ok(obj);
	}

}
