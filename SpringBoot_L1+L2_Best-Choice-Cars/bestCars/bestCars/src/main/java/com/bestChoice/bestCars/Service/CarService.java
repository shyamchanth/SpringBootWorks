package com.bestChoice.bestCars.Service;


import com.bestChoice.bestCars.Entity.Car;
import com.bestChoice.bestCars.Repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService {
    @Autowired
    CarRepository carRepository;


    public List<Car> findAllCarDetails()
    {
        return carRepository.findAll();
    }

    public List<Car> searchByCarBrand(String brand){
        return carRepository.findByBrand(brand);
    }



}
