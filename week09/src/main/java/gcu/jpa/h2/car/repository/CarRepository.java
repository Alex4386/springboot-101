package gcu.jpa.h2.car.repository;

import gcu.jpa.h2.car.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car, Long> {
}
