package com.api.museu.museu.service;

import com.api.museu.museu.model.Item;
import com.api.museu.museu.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class ItemService {
    @Autowired
    private ItemRepository itemRepository;

    public Item itemRegistration(Item item){
        item.setUltimaAtualizacao(LocalDate.now());
        return itemRepository.save(item);
    }
    public Item itemFindById(long id){
        return  itemRepository.getById(id);
    }
    public List<Item> findAll(){
        return itemRepository.findAll();

    }

    public Item itemUpdate(Item item){
            return itemRepository.save(item);
    }
}
