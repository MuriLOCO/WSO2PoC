package com.jose.wso2poc.controllers;

import com.jose.wso2poc.entities.MenuItem;
import com.jose.wso2poc.services.MenuItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MenuItemController {

    @Autowired
    private MenuItemService menuItemService;

    @RequestMapping("/menu")
    public Iterable<MenuItem> getMenu(){
        return menuItemService.getAllMenuItems();
    }
}
