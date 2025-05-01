
package gcu.jpa.h2.car.controller;

import gcu.jpa.h2.car.entity.Car;
import gcu.jpa.h2.car.repository.CarRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cars")
public class CarController {
    
    private final CarRepository carRepository;
    
    public CarController(CarRepository carRepository) {
        this.carRepository = carRepository;
    }
    
    @PostMapping
    public Car create(@RequestBody Car car) {
        return carRepository.save(car);
    }

    @GetMapping
    public List<Car> findAll() {
        return carRepository.findAll();
    }
}
