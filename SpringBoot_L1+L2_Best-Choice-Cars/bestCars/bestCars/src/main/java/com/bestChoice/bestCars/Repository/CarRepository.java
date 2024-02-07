package com.bestChoice.bestCars.Repository;

import com.bestChoice.bestCars.Entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CarRepository extends JpaRepository<Car, Long> {

    List<Car> findByBrand(String brand);

    List<Car> findByPriceBetween(double fromPrice, double toPrice);

    List<Car> findByPriceLessThan(int price);

    List<Car> findByPriceGreaterThan(int price);
}
