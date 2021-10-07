package com.example.Basketball.Player;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PlayerConfig {
    
    @Bean
    CommandLineRunner clr(PlayerRepo playerRepo){
        return args -> {
            Player charlie = new Player("Charlie Irmiger", 7.0, 25, 14.5);
            Player joel = new Player("Joel Embiid", 7.1, 21, 23.6);
            Player ricky = new Player("Ricky Rubio", 6.4, 12, 11.3);

            playerRepo.saveAll(List.of(charlie, joel, ricky));
        };
    }
}
