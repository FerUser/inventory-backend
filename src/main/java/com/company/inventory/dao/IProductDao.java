package com.company.inventory.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.company.inventory.model.Product;

public interface IProductDao extends CrudRepository<Product, Long> {

	@Query("select p from Product where p.name like %?1%")
	List<Product> findByNameContainingIgnoreCase(String name);
	
}
