package com.Project.ECommerce;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import com.Project.ECommerce.Model.ECommerce;
import com.Project.ECommerce.Repository.ECommerceRepository;

@SpringBootApplication
public class CarParkingDatabase1Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(CarParkingDatabase1Application.class, args);
	}
@Autowired
private ECommerceRepository eCommerceRepository;

@Override
public void run(String... args) throws Exception{
	this.eCommerceRepository.save(new ECommerce("Soap", 7900));
	this.eCommerceRepository.save(new ECommerce("Phone", 100));
}
}
