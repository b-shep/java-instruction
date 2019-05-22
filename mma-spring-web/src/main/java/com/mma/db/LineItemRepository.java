package com.mma.db;

import org.springframework.data.repository.CrudRepository;

import com.mma.logic.LineItem;

public interface LineItemRepository extends CrudRepository<LineItem, Integer> {

}
