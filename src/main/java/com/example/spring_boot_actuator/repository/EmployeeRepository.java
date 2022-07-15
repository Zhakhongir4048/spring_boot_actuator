package com.example.spring_boot_actuator.repository;

import com.example.spring_boot_actuator.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    // Написал свой метод согласно конвенциям Spring Data JPA, реализовывать его не надо. Spring сам сделает
    List<Employee> findAllByName(String name);

}