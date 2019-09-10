package com.jose.wso2poc.services;

import com.jose.wso2poc.entities.MenuItem;
import com.jose.wso2poc.repositories.MenuItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuItemService {

    @Autowired
    private MenuItemRepository menuItemRepository;

    public List<MenuItem> getAllMenuItems(){
        return menuItemRepository.findAll();
    }

    public MenuItem saveMenuItem(MenuItem menuItem){
        return menuItemRepository.save(menuItem);
    }
}
