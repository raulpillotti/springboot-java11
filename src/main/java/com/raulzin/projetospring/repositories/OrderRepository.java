package com.raulzin.projetospring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.raulzin.projetospring.entities.Order;


//instaciando interface JPA Repository para acessar operações do banco

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

}
