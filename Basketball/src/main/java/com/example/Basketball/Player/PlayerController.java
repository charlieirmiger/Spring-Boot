package com.example.Basketball.Player;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path="home")
public class PlayerController {
    
    private PlayerService playerService;

    @Autowired
    public PlayerController(PlayerService ps){
        this.playerService = ps;
    }

    @GetMapping("/all")
    public List<Player> players(){
        return playerService.getPlayers();
    }
}
