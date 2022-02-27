package com.menu.service1.menu_microservice.model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "menus")

public class Menu {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private LocalDate menuDate;
    @OneToMany(mappedBy = "menu", cascade = CascadeType.MERGE, fetch = FetchType.EAGER)
    private List<Item> items;


    @Column(name = "updated_on", nullable = false)
    private LocalDate updatedDate;

    public Menu() {
    }

    public Menu(LocalDate menuDate, List<Item> items, LocalDate updatedDate) {
        this.menuDate = menuDate;
        this.items = items;
        this.updatedDate = updatedDate;
    }

    public Menu(Integer id, LocalDate menuDate, List<Item> items, LocalDate updatedDate) {
        this.id = id;
        this.menuDate = menuDate;
        this.items = items;
        this.updatedDate = updatedDate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDate getMenuDate() {
        return menuDate;
    }

    public void setMenuDate(LocalDate menuDate) {
        this.menuDate = menuDate;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public LocalDate getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(LocalDate updatedDate) {
        this.updatedDate = updatedDate;
    }

}
