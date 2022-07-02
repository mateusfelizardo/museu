package com.api.museu.museu.controller;

import com.api.museu.museu.model.Item;
import com.api.museu.museu.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/item")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class ItemController {
    @Autowired
    private ItemService itemService;

    @PostMapping(value = "create")
    public ResponseEntity<Item> itemRegistration(@RequestBody Item item){

        return new ResponseEntity<>(itemService.itemRegistration(item), HttpStatus.OK);
    }

    @PutMapping (value = "update")
    public ResponseEntity<Item> itemUpdate(@RequestBody Item item){

        return new ResponseEntity<>(itemService.itemUpdate(item), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> itemFindById(@PathVariable("id") int id){
            Item item = itemService.itemFindById(id);
            return new ResponseEntity<>(item, HttpStatus.OK);
    }

    @GetMapping("/all")
    public ResponseEntity<List<Item>> itemFindAll(){
        List<Item> item = itemService.findAll();
        return new ResponseEntity<>(item, HttpStatus.OK);
    }
}
