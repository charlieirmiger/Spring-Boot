package com.example.Basketball.Player;

import java.util.List;

import org.springframework.stereotype.Service;

//Service is more specific version of @Component 
@Service
public class PlayerService {

    private final PlayerRepo playerRepo;

    public PlayerService(PlayerRepo pr){
        this.playerRepo = pr;
    }
    
    public List<Player> getPlayers(){
        return playerRepo.findAll();
        //return List.of(new Player("Charlie", 7.0, 25, 14.5));
    }
}
