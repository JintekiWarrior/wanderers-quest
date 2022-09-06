package com.moeGames.wanderersQuest.Service.ItemService;

import com.moeGames.wanderersQuest.Dao.ItemDao;
import com.moeGames.wanderersQuest.Entity.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ItemServiceImpl implements ItemService {

    @Autowired
    private ItemDao itemDao;

    @Override
    public List<Item> getAllItems() {
        return this.itemDao.findAll();
    }

    @Override
    public Item getItemById(int itemId) {
        Optional<Item> i = this.itemDao.findById(itemId);
        Item result = null;
        if (i.isPresent())
        {
            result = i.get();
        } else
        {
            throw new RuntimeException("Item Id was not found. " + itemId);
        }

        return result;
    }

    @Override
    public Item addItem(Item item) {
        return this.itemDao.save(item);
    }

    @Override
    public Item updateItem(Item item) {
        return this.itemDao.save(item);
    }

    @Override
    public String deleteItemById(int itemId) {
        this.itemDao.deleteById(itemId);
        return "Deleted Player Successfully";
    }
}
