package com.devsuperior.DSList.repositories;

import com.devsuperior.DSList.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;


public interface GameRepository extends JpaRepository<Game, Long> {

}
