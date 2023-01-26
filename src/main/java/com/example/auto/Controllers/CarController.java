package com.example.auto.Controllers;

import com.example.auto.Models.CarModel;
import com.example.auto.Services.CarService;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CarController {
    @Autowired
    private CarService carService;

    @GetMapping(value = "/cars/{id}")
    public CarModel getCar(@PathVariable Long id) {
        return carService.getCarById(id);
    }

    @GetMapping(value = "/cars")
    public List<CarModel> findAllCars(){
        return carService.getAllCar();
    }

    @DeleteMapping(value = "/cars/{id}")
    public String deleteCar(@PathVariable Long id){
        carService.deleteCar(id);
        return "removed";
    }

    @PostMapping(value = "/cars/add", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public CarModel addCar(@RequestBody CarModel carModel){
        return carService.addCar(carModel);
    }

    @PutMapping(value = "/cars/update")
    public CarModel updateCar(@RequestBody CarModel carModel){
        return carService.updateCar(carModel);
    }

}
