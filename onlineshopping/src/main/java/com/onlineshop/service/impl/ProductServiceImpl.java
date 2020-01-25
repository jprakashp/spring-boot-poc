package com.onlineshop.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlineshop.dao.ProductRepository;
import com.onlineshop.dto.Product;
import com.onlineshop.service.ProductService;
@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	public ProductRepository productRepo;
	
	@Override
	public void save(Product product) {
		productRepo.save(product);
	}

	@Override
	public List<Product> findAllProduct() {
		
		return productRepo.findAll();
	}

	@Override
	public Product getById(long id) {
		
		return productRepo.findById(id).get();
	}

	@Override
	public void delete(long id) {
		productRepo.deleteById(id);
		
	}

}
