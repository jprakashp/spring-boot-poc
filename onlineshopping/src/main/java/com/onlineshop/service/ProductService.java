package com.onlineshop.service;

import java.util.List;

import com.onlineshop.dto.Product;

public interface ProductService {

	void save(Product product);
	List<Product> findAllProduct();
	Product getById(long id);
	void delete(long id); 
}
