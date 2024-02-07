package com.demo.Assignment5.Controller;

import com.demo.Assignment5.Entity.Employee;
import com.demo.Assignment5.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @PostMapping("/create")
    public ResponseEntity<Employee> createEmployee(@RequestBody Employee employee) {
        Employee employee1 = employeeService.CreateEmployee(employee);
        return ResponseEntity.ok(employee1);
    }

    @GetMapping("/get/{employeeId}")
    public ResponseEntity<Employee> getEmployeeDetailsById(@PathVariable String employeeId) {
        return ResponseEntity.ok(employeeService.GetEmployeeId(employeeId));
    }

    @DeleteMapping("/delete/{employeeId}")
    public ResponseEntity<String> deleteEmployeeId(@PathVariable String employeeId) {
        employeeService.deleteEmployeeId(employeeId);
        return ResponseEntity.ok("SuccessFully Deleted");
    }

    @GetMapping("/get")
    public List<Employee> getAllEmployees() {
        return employeeService.getAllEmployees();
    }

    @PutMapping("/update/{employeeId}")
    public Employee updateEmployeeDetails(@PathVariable String employeeId, @RequestBody Employee updatedEmployee) {
        return employeeService.updateEmployeeDetails(employeeId, updatedEmployee);
    }
}

//    JSON
//    {
//            "employeeName":"shyam",
//            "employeeEmail":"shyam@gmail.com",
//            "employeeLocation":"madurai"
//    }

