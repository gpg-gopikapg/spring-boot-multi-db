package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.product.Product;
import com.example.demo.service.IProductService;

@RestController
@RequestMapping("/product")
public class ProductController {

	@Autowired
	IProductService service;

	@PostMapping("/create")
	public ResponseEntity<String> saveProduct(@RequestBody Product product) {
		return ResponseEntity.ok("Product Record Created with Id:" + service.saveProduct(product));
	}

}