package com.moeGames.wanderersQuest.Dao;

import com.moeGames.wanderersQuest.Entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemDao extends JpaRepository<Item, Integer> {
}
