package com.bestChoice.bestCars;

import com.bestChoice.bestCars.Entity.Car;
import com.bestChoice.bestCars.Repository.CarRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class BestCarsApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(BestCarsApplication.class, args);
    }

    @Autowired
    CarRepository carRepository;

    @Override
    public void run(String... args) throws Exception {
        Car car1 = new Car("Hyundai", "i10", "2019", 10000, 300000, "petrol");
        Car car2 = new Car("Hyundai", "i20", "2018", 20000, 200000, "Diesel");
        Car car3 = new Car("Hyundai", "Verna", "2019", 15000, 250000, "Petrol");
        Car car4 = new Car("Tata","Bolt","2019",15000,250000,"Petrol");
        Car car5 = new Car("Maruthi Suzuki","Ciaz","2019",5000,600000,"Petrol");
        Car car6 = new Car("Honda","jazz","2018",20000,200000,"Diesel");
        Car car7 = new Car("Honda","City","2019",15000,400000," ");
        Car car8 = new Car("Maruthi Suzuki","Ertiga","2018",10000,550000,"Petrol");
        Car car9 = new Car("Tata","Nexon","2019",5000,600000,"Petrol");

        carRepository.save(car1);
        carRepository.save(car2);
        carRepository.save(car3);
        carRepository.save(car4);
        carRepository.save(car5);
        carRepository.save(car6);
        carRepository.save(car7);
        carRepository.save(car8);
        carRepository.save(car9);


    }
}
