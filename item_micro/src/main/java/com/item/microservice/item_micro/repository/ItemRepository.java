package com.item.microservice.item_micro.repository;

import com.item.microservice.item_micro.model.Item;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository< Item, Integer>{
    
}
