package com.moeGames.wanderersQuest.Controller;

import com.moeGames.wanderersQuest.Entity.Player;
import com.moeGames.wanderersQuest.Service.PlayerService.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PlayerController
{
    @Autowired
    private PlayerService playerService;

    @GetMapping("/")
    public String home()
    {
        return "Home Sweet Home";
    }


    @GetMapping("/players")
    public List<Player> getPlayers()
    {
        return this.playerService.getAllPlayers();
    }

    @GetMapping("/players/{playerId}")
    public Player getPlayer(@PathVariable String playerId)
    {
        return this.playerService.getPlayerById(Integer.parseInt(playerId));
    }

    @PostMapping("/players")
    public Player addPlayer(@RequestBody Player player)
    {
        return this.playerService.addPlayer(player);
    }

    @PutMapping("/players")
    public Player updatePlayer(@RequestBody Player player)
    {
        return this.playerService.updatePlayer(player);
    }

    @DeleteMapping("/players/{playerId}")
    public String deletePlayer(@PathVariable String playerId)
    {
        return this.playerService.deletePlayerById(Integer.parseInt(playerId));
    }
}
