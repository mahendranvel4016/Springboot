package com.Project.ECommerce.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Project.ECommerce.Model.ECommerce;
import com.Project.ECommerce.Repository.ECommerceRepository;


@RestController
@RequestMapping("/api")
public class ECommerceController {
	@Autowired
	ECommerceRepository eCommerceRepository;
	
	@GetMapping("/shoping")
	public List<ECommerce>getAllProduct(){
		return this.eCommerceRepository.findAll();
	
}
}