package com.raulzin.projetospring.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.raulzin.projetospring.entities.Product;
import com.raulzin.projetospring.repositories.ProductRepository;

@Service // registrar classe como componente de serviço do Spring

public class ProductService {

	// camada de serviços (ProductServices) tem dependência com a camada de repositório
	// (ProductRepository)

	@Autowired
	private ProductRepository repository;

	// método para retornar todos usuários do banco de dados
	public List<Product> findAll() {

		return repository.findAll();
 
	}
	
	//método para retornar usuário por id
	public Product findById(Long id) {
		
		 Optional <Product> obj = repository.findById (id);
		 return obj.get();
	}

}
