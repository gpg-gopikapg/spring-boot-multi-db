package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.product.Product;
import com.example.demo.repository.product.ProductRepository;

@Service
public class ProductImpl implements IProductService {

	@Autowired
	private ProductRepository repo;

	@Override
	public Integer saveProduct(Product product) {
		product = repo.save(product);
		return product.getId();
	}

}
