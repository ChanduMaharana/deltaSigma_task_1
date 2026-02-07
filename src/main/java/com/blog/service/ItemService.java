package com.blog.service;

import java.util.*;

import org.springframework.stereotype.Service;

import com.blog.model.Item;

@Service
public class ItemService {
	
	private final List<Item> items = new ArrayList<>();
    private Long idCounter = 1L;

    public Item addItem(Item item) {
        item.setId(idCounter++);
        items.add(item);
        return item;
    }

    public Item getItemById(Long id) {
        return items.stream()
                .filter(item -> item.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

}
