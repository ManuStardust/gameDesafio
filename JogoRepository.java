package com.senai.manuela.PrjGame.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.senai.manuela.PrjGame.entities.Jogo;

public interface JogoRepository extends JpaRepository<Jogo, Long>{
	
}