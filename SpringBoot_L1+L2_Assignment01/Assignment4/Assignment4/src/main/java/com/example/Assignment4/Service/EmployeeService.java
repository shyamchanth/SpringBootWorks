package com.example.Assignment4.Service;

import com.example.Assignment4.Model.Employee;

import java.util.List;


public interface EmployeeService {

    List<Employee> displayEmployeeDetails();

    Employee displayEmployeeDetailsById(int id);

   List<Employee> displayEmployeeDetailsByName(String employeeName);

    Employee createEmployeeDetails(Employee employee);

    void deleteEmployeeDetailsById(int id);

    void deleteByEmployeeName(String employeeName);

    Employee updateEmployeeDetails(int id,Employee employee);



}
