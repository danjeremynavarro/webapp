package com.danjeremynavarro.xoddu.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.danjeremynavarro.xoddu.domain.Car;
import com.danjeremynavarro.xoddu.domain.CarRepository;

@RestController
public class CarController {
	
	@Autowired
	CarRepository carRepository;
	
	@RequestMapping("/cars")
	public Iterable<Car> getCars(){
		Iterable<Car> result = carRepository.findAll();
		return result;
	}
}
