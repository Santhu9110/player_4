package com.example.player;

import org.springframework.web.bind.annotation.*;
import java.util.*;

import com.example.player.PlayerService;
import com.example.player.Player;

@RestController
public class PlayerController {
    PlayerService playerService = new PlayerService();

    @GetMapping("/players")
    public ArrayList<Player> getPlayers() {
        return playerService.getPlayers();
    }

    @GetMapping("/players/{playerId}")
    public player getPlayerById(@PathVariable("playerId") int playerId) {
        return PlayerService.getPlayerById(playerId);
    }

    @PostMapping("/players")
    public player addPlayer(@RequestBody Player player) {
        return PlayerService.addPlayer(player);
    }

    @PutMapping("/players/{playerId}")
    public Player updatePlayer(@PathVariable("playerId") int playerId, @RequestBody Player player) {
        return PlayerService.updatePlayer(playerId, player);
    }

    @DeleteMapping("/players/{playerId}")
    public void deletePlayer(@PathVariable int playerId) {
        playerService.deletePlayer(playerId);
    }
}

