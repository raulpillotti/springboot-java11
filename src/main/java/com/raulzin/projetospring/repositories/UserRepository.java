package com.raulzin.projetospring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.raulzin.projetospring.entities.User;


//instaciando interface JPA Repository para acessar operações do banco

public interface UserRepository extends JpaRepository<User, Long> {

}
