package com.danjeremynavarro.xoddu.domain;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface CarRepository extends CrudRepository<Car, Long> {
	
	// Fetch Cars by Brand
	List<Car> findByBrand(@Param("brand") String brand);
}
