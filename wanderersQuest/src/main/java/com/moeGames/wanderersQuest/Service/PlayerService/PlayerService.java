package com.moeGames.wanderersQuest.Service.PlayerService;

import com.moeGames.wanderersQuest.Dao.PlayerDao;

import java.util.List;

public interface PlayerService {
    List<PlayerDao> getAllPlayers();
    PlayerDao getPlayerById(int playerId);
    PlayerDao addPlayer(PlayerDao player);
    PlayerDao updatePlayer(PlayerDao player);
    String deletePlayerById(int playerId);
}
