package com.brn.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.brn.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {
	
}
