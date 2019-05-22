package com.mma.db;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.mma.logic.Product;

public interface ProductRepository extends CrudRepository<Product, Integer> {
					//the By in findBy indicates a "WHERE" jpsql statement
	Optional<Product> findByCode(String code);
	
}
