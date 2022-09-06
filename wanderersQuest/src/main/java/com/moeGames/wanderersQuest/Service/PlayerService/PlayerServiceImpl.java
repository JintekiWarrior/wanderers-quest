package com.moeGames.wanderersQuest.Service.PlayerService;

import com.moeGames.wanderersQuest.Dao.PlayerDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerServiceImpl implements PlayerService
{
    @Autowired
    private PlayerDao playerDao;

    @Override
    public List<PlayerDao> getAllPlayers() {
        return this.playerDao.findAll();
    }

    @Override
    public PlayerDao getPlayerById(int playerId) {
        return null;
    }

    @Override
    public PlayerDao addPlayer(PlayerDao player) {
        return null;
    }

    @Override
    public PlayerDao updatePlayer(PlayerDao player) {
        return null;
    }

    @Override
    public String deletePlayerById(int playerId) {
        return null;
    }
}
