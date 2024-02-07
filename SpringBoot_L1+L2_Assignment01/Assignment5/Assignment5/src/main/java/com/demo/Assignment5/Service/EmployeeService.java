package com.demo.Assignment5.Service;

import com.demo.Assignment5.Entity.Employee;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class EmployeeService {

   private HashMap<String,Employee> hashMap = new HashMap<>();

   public Employee CreateEmployee(Employee employee)
   {
      String employeeId = generateEmployeeId();
      employee.setEmployeeId(employeeId);
      hashMap.put(employeeId,employee);
      return employee;
   }

   public Employee GetEmployeeId(String employeeId)
   {

      return hashMap.get(employeeId);
   }


   public void deleteEmployeeId(String employeeId)
   {
      hashMap.remove(employeeId);
   }

   public List<Employee> getAllEmployees() {
       return new ArrayList<>(hashMap.values());

   }

   public Employee updateEmployeeDetails(String employeeId,Employee updatedEmployee)
   {
      if(hashMap.containsKey(employeeId))
      {
          updatedEmployee.setEmployeeId(employeeId);
          hashMap.put(employeeId,updatedEmployee);
          return updatedEmployee;
      }
       return null;
   }

   private String generateEmployeeId() {
      return UUID.randomUUID().toString();
   }


}
