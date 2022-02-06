package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.customer.Customer;
import com.example.demo.service.ICustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	ICustomerService service;

	@PostMapping("/create")
	public ResponseEntity<String> saveStudent(@RequestBody Customer customer) {
		return ResponseEntity.ok("Student Record Created with Id:" + service.saveCustomer(customer));
	}

}