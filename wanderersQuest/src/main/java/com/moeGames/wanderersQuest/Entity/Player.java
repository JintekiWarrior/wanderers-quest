package com.moeGames.wanderersQuest.Entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "tbl_Players")
public class Player {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;

    // player stats
    private int health;
    private int stamina;
    private int mana;

    @OneToMany(mappedBy = "Item")
    private List<Item> inventory;

    public Player() {
    }

    public Player(int id, String name, int health, int stamina, int mana) {
        this.id = id;
        this.name = name;
        this.health = health;
        this.stamina = stamina;
        this.mana = mana;
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

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }
}