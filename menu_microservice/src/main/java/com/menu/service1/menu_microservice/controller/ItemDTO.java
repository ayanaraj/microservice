package com.menu.service1.menu_microservice.controller;

import java.util.List;

import com.menu.service1.menu_microservice.model.Item;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ItemDTO {

    private List<Item> items;
}
