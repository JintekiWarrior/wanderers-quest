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

    public Item() {
    }

    public Item(int id, String name, String effect, Player player) {
        this.id = id;
        this.name = name;
        this.effect = effect;
        this.player = player;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEffect() {
        return effect;
    }

    public void setEffect(String effect) {
        this.effect = effect;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }
}
