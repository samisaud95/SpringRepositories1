package com.example.springRepository1.Repository;

import com.example.springRepository1.Entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Repository extends JpaRepository<Car,Long> {
}
