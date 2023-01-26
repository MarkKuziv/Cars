package com.example.auto.Services;

import com.example.auto.Models.CarModel;
import com.example.auto.Repositories.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService {
    @Autowired
    private CarRepository carRepository;

    public CarModel getCarById(Long id) {
        return carRepository.findCarById(id);
    }

    public List<CarModel> getAllCar() {
        return carRepository.findAll();
    }

    public void deleteCar(Long id) {
        carRepository.deleteById(id);
    }

    public CarModel addCar(CarModel carModel) {
        return carRepository.save(carModel);
    }

    public CarModel updateCar(CarModel newCar){
        CarModel car = getCarById(newCar.getId());
        updateCar(newCar, car);
        carRepository.save(car);
        return newCar;
    }

    private static void updateCar(CarModel newCar, CarModel car) {
        car.setColor(newCar.getColor());
        car.setModel(newCar.getModel());
        car.setName(newCar.getName());
        car.setType(newCar.getType());
    }

}
