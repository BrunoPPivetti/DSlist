package com.brn.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.brn.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {
	
}
