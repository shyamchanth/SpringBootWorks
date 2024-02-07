package com.example.Assignment4.Service;

import com.example.Assignment4.Model.Employee;
import com.example.Assignment4.Repository.EmployeeRepo;
import jakarta.persistence.EntityNotFoundException;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class EmployeeServiceImp implements EmployeeService{


    @Autowired
    EmployeeRepo employeeRepo;

    @Override
    public List<Employee> displayEmployeeDetails(){
        return employeeRepo.findAll();
    }



    @Override
    public Employee displayEmployeeDetailsById(int id){
        return employeeRepo.findById(id);

    }

    @Override
    public List<Employee> displayEmployeeDetailsByName(String employeeName) {
       return employeeRepo.findByEmployeeName(employeeName);
    }

    @Override
    public Employee createEmployeeDetails(Employee employee){

        return employeeRepo.save(employee);
    }

    @Override
    @Transactional
    public void deleteEmployeeDetailsById(int id){
        employeeRepo.deleteById(id);
    }

    @Override
    @Transactional
    public void deleteByEmployeeName(String employeeName){

        employeeRepo.deleteByEmployeeName(employeeName);
    }

    @Override
    public Employee updateEmployeeDetails(int id, Employee employee) {
        Employee exEmployee=employeeRepo.findById(id);
        exEmployee.setEmployeeName(employee.getEmployeeName());
        exEmployee.setEmployeeLocation(employee.getEmployeeLocation());
        exEmployee.setEmployeeEmail(employee.getEmployeeEmail());
        return employeeRepo.save(exEmployee);
    }
}
