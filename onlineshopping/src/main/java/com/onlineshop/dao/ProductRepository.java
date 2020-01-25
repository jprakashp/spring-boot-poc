package com.onlineshop.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.onlineshop.dto.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
