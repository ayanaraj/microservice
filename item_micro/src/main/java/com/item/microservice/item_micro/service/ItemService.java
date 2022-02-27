package com.item.microservice.item_micro.service;

import java.util.List;
import java.util.Optional;

import com.item.microservice.item_micro.model.Item;

public interface ItemService {

    Item create(Item item);

    Optional <Item> findById(Integer id);

    List <Item> findAll();
    Item save(Item item);
    List<Item> findAllById(List<Integer> ids);
    void delete(Integer id);

    
    
     
    
}
