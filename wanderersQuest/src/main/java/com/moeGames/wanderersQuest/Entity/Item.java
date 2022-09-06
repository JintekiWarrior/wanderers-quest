package com.moeGames.wanderersQuest.Entity;

import javax.persistence.*;

@Entity
@Table
public class Item
{
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private String effect;

    @ManyToOne
    @JoinColumn(name="player_id", nullable = false)
    private Player player;
}
