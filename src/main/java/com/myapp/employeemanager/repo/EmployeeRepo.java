package com.myapp.employeemanager.repo;

import com.myapp.employeemanager.model.Employee;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {  

   void deleteEmployeeById(Long id);

    Optional<Employee> findEmployeeById(Long id);
    
}
