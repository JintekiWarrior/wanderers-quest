package com.moeGames.wanderersQuest.Service.PlayerService;

import com.moeGames.wanderersQuest.Entity.Player;

import java.util.List;

public interface PlayerService {
    List<Player> getAllPlayers();
    Player getPlayerById(int playerId);
    Player addPlayer(Player player);
    Player updatePlayer(Player player);
    String deletePlayerById(int playerId);
}
