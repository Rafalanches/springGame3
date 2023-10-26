package com.senai.rafael.PrjGame.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.senai.rafael.PrjGame.entities.Jogo;

public interface JogoRepository extends JpaRepository<Jogo, Long> {

}