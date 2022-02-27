package com.menu.service1.menu_microservice.controller;

import java.time.LocalDate;

import com.menu.service1.menu_microservice.model.Menu;
import com.menu.service1.menu_microservice.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/menu")

public class MenuController {
    @Autowired
    RestTemplate restTemplate;

    @Autowired
    MenuService menuService;

    @PostMapping(value="")
    public ResponseEntity<Menu> createMenu(@RequestBody MenuDTO menuDTO){


       ItemDTO itemDTO = restTemplate.postForObject("http://localhost:9000/api/items/list", menuDTO.getItems(), ItemDTO.class);
       itemDTO.getItems().forEach(System.out::println);
       Menu entity = new Menu();
       entity.setMenuDate(menuDTO.getMenuDate());
       entity.setItems(itemDTO.getItems());
       entity.setUpdatedDate(LocalDate.now());
       Menu menu = menuService.save(entity);
       return ResponseEntity.status(HttpStatus.CREATED).body(menu);

    }
    
}
