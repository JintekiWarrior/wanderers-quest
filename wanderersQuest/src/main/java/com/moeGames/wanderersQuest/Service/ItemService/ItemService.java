package com.moeGames.wanderersQuest.Service.ItemService;

import com.moeGames.wanderersQuest.Entity.Item;

import java.util.List;

public interface ItemService
{
    List<Item> getAllItems();
    Item getItemById(int itemId);
    Item addItem(Item item);
    Item updateItem(Item item);
    String deleteItemById(int itemId);
}
