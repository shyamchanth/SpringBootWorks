package com.example.Assignment4.Repository;

import com.example.Assignment4.Model.Employee;
import jakarta.persistence.Id;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Id> {

    Employee findById(int id);

    void deleteById(int id);

   List<Employee> findByEmployeeName(String employeeName);

   void deleteByEmployeeName(String employeeName);
}
