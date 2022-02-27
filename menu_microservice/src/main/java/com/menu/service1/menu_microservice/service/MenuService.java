package com.menu.service1.menu_microservice.service;

import java.time.LocalDate;
import java.util.List;

import com.menu.service1.menu_microservice.model.Menu;

public interface MenuService {

    Menu findByMenuDate(LocalDate date);

    Menu save(Menu entity);

    void deleteByMenuDate(LocalDate date);

    List<Menu> findByMenuDateBetween(LocalDate startDate, LocalDate endDate);

}
