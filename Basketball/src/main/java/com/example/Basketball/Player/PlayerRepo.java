package com.example.Basketball.Player;

import org.springframework.data.jpa.repository.JpaRepository;

//Data access layer

public interface PlayerRepo extends JpaRepository<Player, Long>{
    
}
