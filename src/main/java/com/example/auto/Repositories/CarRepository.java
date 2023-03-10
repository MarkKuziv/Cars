package com.example.auto.Repositories;

import com.example.auto.Models.CarModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CarRepository extends JpaRepository<CarModel, Long> {
    CarModel findCarById(Long id);

    List<CarModel> findAll();
}
