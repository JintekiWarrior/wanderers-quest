package com.moeGames.wanderersQuest.Dao;

import com.moeGames.wanderersQuest.Entity.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayerDao extends JpaRepository<Player, Integer> {
}
