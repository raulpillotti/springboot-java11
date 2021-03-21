package com.raulzin.projetospring.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.raulzin.projetospring.entities.Order;
import com.raulzin.projetospring.repositories.OrderRepository;

@Service // registrar classe como componente de serviço do Spring

public class OrderService {

	// camada de serviços (OrderServices) tem dependência com a camada de repositório
	// (OrderRepository)

	@Autowired
	private OrderRepository repository;

	// método para retornar todos usuários do banco de dados
	public List<Order> findAll() {

		return repository.findAll();
 
	}
	
	//método para retornar usuário por id
	public Order findById(Long id) {
		
		 Optional <Order> obj = repository.findById (id);
		 return obj.get();
	}

}
