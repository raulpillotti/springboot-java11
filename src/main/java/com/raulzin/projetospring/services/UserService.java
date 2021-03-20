package com.raulzin.projetospring.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.raulzin.projetospring.entities.User;
import com.raulzin.projetospring.repositories.UserRepository;

@Service // registrar classe como componente de serviço do Spring

public class UserService {

	// camada de serviços (UserServices) tem dependência com a camada de repositório
	// (UserRepository)

	@Autowired
	private UserRepository repository;

	// método para retornar todos usuários do banco de dados
	public List<User> findAll() {

		return repository.findAll();

	}
	
	//método para retornar usuário por id
	public User findById(Long id) {
		
		 Optional <User> obj = repository.findById (id);
		 return obj.get();
	}

}
