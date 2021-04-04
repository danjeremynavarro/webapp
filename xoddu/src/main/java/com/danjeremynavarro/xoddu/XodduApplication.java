package com.danjeremynavarro.xoddu;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.danjeremynavarro.xoddu.domain.Car;
import com.danjeremynavarro.xoddu.domain.CarRepository;
import com.danjeremynavarro.xoddu.domain.Owner;
import com.danjeremynavarro.xoddu.domain.OwnerRepository;

@SpringBootApplication
public class XodduApplication {
	
	@Autowired
	CarRepository carRepository;
	
	@Autowired
	OwnerRepository ownerRepository;
	
	@Autowired
	UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(XodduApplication.class, args);
	}
	
	@Bean
	public Logger logger() {
		return LoggerFactory.getLogger(XodduApplication.class);
	}
	
	/**
	 * Test many to many relation
	 * @param logger
	 * @return
	 */
	@Bean
	@Autowired
	CommandLineRunner runner(Logger logger) {
		return args -> {
			Owner owner1 = new Owner("Dan", "Navarro");
			Owner owner2 = new Owner("Jeremy", "Navarro");
			Owner owner3 = new Owner("Ibarra", "Nain");
			Owner owner4 = new Owner("Castiel", "Jolly");
			
			ownerRepository.save(owner1);
			ownerRepository.save(owner2);
			ownerRepository.save(owner3);
			ownerRepository.save(owner4);
				
			Car car1 = new Car("Ford", "Mustang", "red", "LKA-9021", 2019,
						50000, owner1);			
			Car car2 = new Car("Toyota", "Corolla", "blue", "TUY-1029", 2020,
					20000, owner3);
			Car car3 = new Car("Tesla", "Model-X", "black", "POT-3940", 2020,
					40000, owner4);
			
			carRepository.save(car1);
			carRepository.save(car2);
			carRepository.save(car3);
			
			//username: user password: user
			userRepository.save(new User("user",
					"$2a$04$1.YhMIgNX/8TkCKGFUONWO1waedKhQ5KrnB30fl0Q01QKqmzLf.Zi", "USER", "Testuser", "B", "Navarro"));
			//username: admin password: admin
			userRepository.save(new User("admin",
					"$2a$04$KNLUwOWHVQZVpXyMBNc7JOzbLiBjb9Tk9bP7KNcPI12ICuvzXQQKG", "ADMIN", "TestAdmin", "B", "Navarro"));
		};
	}
}
