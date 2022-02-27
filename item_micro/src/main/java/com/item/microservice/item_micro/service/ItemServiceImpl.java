package com.item.microservice.item_micro.service;

import java.util.List;
import java.util.Optional;

import com.item.microservice.item_micro.model.Item;
import com.item.microservice.item_micro.repository.ItemRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemServiceImpl implements ItemService{
    @Autowired
    private ItemRepository itemRepository;
    @Override
    public Item create(Item item) {
        
        return itemRepository.save(item);

    }
    @Override
    public Optional<Item> findById(Integer id) {
       
        return itemRepository.findById(id);
    }

    @Override
    public List<Item> findAll() {
       
        return itemRepository.findAll();
    }
    @Override
    public Item save(Item item) {
        
        return itemRepository.save(item);
        
    }
    @Override
    public void delete(Integer id) {
        itemRepository.deleteById(id);
        
    }
    @Override
    public List<Item> findAllById(List<Integer> ids) {
        
        return itemRepository.findAllById(ids);
    }
   
    
}
