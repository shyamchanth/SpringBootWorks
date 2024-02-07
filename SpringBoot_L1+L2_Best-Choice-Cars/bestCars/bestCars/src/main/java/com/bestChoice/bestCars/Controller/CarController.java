package com.bestChoice.bestCars.Controller;


import com.bestChoice.bestCars.Entity.Car;
import com.bestChoice.bestCars.Repository.CarRepository;
import com.bestChoice.bestCars.Service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class CarController {

    @Autowired
    CarService carService;

    @Autowired
    CarRepository carRepository;


    @GetMapping("/")
    public String displayAllCarDetails(Model model) {
        model.addAttribute("carList", carService.findAllCarDetails());
        return "CarHomePage";
    }

    @GetMapping("/brand")
    public String displayBrandPage(Model model) {
        List<String> brandCar = Arrays.asList("Hyundai", "Tata", "Maruthi Suzuki", "Honda");
        model.addAttribute("carsBrandList", brandCar);
        return "CarBrand";
    }

    @GetMapping("/price")
    public String displayPricePage(Model model) {
        Car carPrice = new Car();
        model.addAttribute("carsPriceList", carPrice);
        return "CarPrice";
    }

    //search by car Brand
    @GetMapping("/cars/searchBrand")
    public String searchCarDetails(@RequestParam String brand, Model model) {
        List<Car> carListByBrand = carService.searchByCarBrand(brand);
        model.addAttribute("carResults", carListByBrand);
        return "SearchedByBrand";


    }


    //Search By Car Price
    @GetMapping("/cars/searchPrice")
    public String searchCarDetailsByPrice(Model model, @RequestParam(value = "priceFilter", required = false) String priceFilter) {
        List<Car> carList = new ArrayList<>();
        if ("below5lakhs".equals(priceFilter)) {
            carList = carRepository.findByPriceLessThan(500000);
        } else if ("above5lakhs".equals(priceFilter)) {
            carList = carRepository.findByPriceGreaterThan(500000);

        } else {
            carList = carRepository.findAll();
        }
        model.addAttribute("carResults", carList);

        return "SearchedByPrice";
    }

    //After Confirm

    @PostMapping("/cars/confirm")
    public String confirmBooking(@RequestParam("selectedCar") String selectedCar, Model model) {
        model.addAttribute("selectedCar", selectedCar);
        return "confirmedCar";
    }


}
