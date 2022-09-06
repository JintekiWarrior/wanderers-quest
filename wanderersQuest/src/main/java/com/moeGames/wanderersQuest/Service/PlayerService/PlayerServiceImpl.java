package com.moeGames.wanderersQuest.Service.PlayerService;

import com.moeGames.wanderersQuest.Dao.PlayerDao;
import com.moeGames.wanderersQuest.Entity.Player;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PlayerServiceImpl implements PlayerService
{
    @Autowired
    private PlayerDao playerDao;

    @Override
    public List<Player> getAllPlayers() {
        return this.playerDao.findAll();
    }

    @Override
    public Player getPlayerById(int playerId) {
        Optional <Player> p = this.playerDao.findById(playerId);
        Player play = null;
        if (p.isPresent())
        {
            play = p.get();
        } else
        {
            throw new RuntimeException("Player Id was not found. " + playerId);
        }

        return play;
    }

    @Override
    public Player addPlayer(Player player) {
        return this.playerDao.save(player);
    }

    @Override
    public Player updatePlayer(Player player) {
        return this.playerDao.save(player);
    }

    @Override
    public String deletePlayerById(int playerId) {
        this.playerDao.deleteById(playerId);
        return "Deleted Player Successfully";
    }
}
