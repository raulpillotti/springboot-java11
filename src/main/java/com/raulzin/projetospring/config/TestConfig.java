package com.raulzin.projetospring.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.raulzin.projetospring.entities.User;
import com.raulzin.projetospring.repositories.UserRepository;

//informar que é uma classe de configuração

@Configuration
@Profile("test")

public class TestConfig implements CommandLineRunner {      //CommandLineRunner = método onde tudo que está dentro é inicializado junto com a aplicação
	
	//injeção de dependência
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		
		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
		User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456");
		
		//salvar usuario no db
		userRepository.saveAll(Arrays.asList(u1,u2));
		
	}
	
	
	
}

