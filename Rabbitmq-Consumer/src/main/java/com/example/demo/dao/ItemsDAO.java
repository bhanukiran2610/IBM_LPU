package com.example.demo.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.Item;

public interface ItemsDAO extends CrudRepository<Item, Integer> {

}
