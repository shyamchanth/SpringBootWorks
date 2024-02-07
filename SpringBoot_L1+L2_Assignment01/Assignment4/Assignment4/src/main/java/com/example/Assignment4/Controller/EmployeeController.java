package com.example.Assignment4.Controller;

import com.example.Assignment4.Model.Employee;
import com.example.Assignment4.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Controller
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping("/register")
    public String registerEmployeeDetails(Model model)
    {
        Employee employee = new Employee();
        model.addAttribute("employee",employee);
        return "index";
    }

    @PostMapping("/employeepost")
    public String employeePost(Employee employee)
    {
        employeeService.createEmployeeDetails(employee);
        return "redirect:/displayAll";
    }

    @GetMapping("/displayAll")
    public String displayEmployee(Model model)
    {
        List<Employee> employeeList = employeeService.displayEmployeeDetails();
        model.addAttribute("employees",employeeList);
        return "displayemployees";
    }

    @GetMapping("/display/{id}")
    public String displayEmployeeById(@PathVariable int id ,Model model)
    {
       Employee employeeDetailsById= employeeService.displayEmployeeDetailsById(id);
       model.addAttribute("employees",employeeDetailsById);
       return "displayemployeesbyid";
    }



//    @GetMapping("/displayEmployee")
//    public ResponseEntity<List<Employee>> displayEmployeeDetails(){
//        return ResponseEntity.ok().body(employeeService.displayEmployeeDetails());
//    }
//
//    @GetMapping("/displaybyid/{id}")
//    public ResponseEntity<Employee> displayEmployeeDetailsById(@PathVariable  int id){
//        return ResponseEntity.ok().body(employeeService.displayEmployeeDetailsById(id));
//    }
//
//
//    @GetMapping("/displayByName/{employeeName}")
//    public ResponseEntity<List<Employee>> displayEmployeeDetailsByName(@PathVariable String employeeName)
//    {
//        List<Employee> employees =employeeService.displayEmployeeDetailsByName(employeeName);
//        if(employees.isEmpty())
//        {
//            return ResponseEntity.notFound().build();
//        }
//        return ResponseEntity.ok(employees);
//    }
//
//    @PostMapping("/create")
//    public ResponseEntity<Employee> createEmployeeDetails(@RequestBody Employee employee){
//        return ResponseEntity.ok().body(employeeService.createEmployeeDetails(employee));
//    }
//
//    @DeleteMapping("/deleteById/{id}")
//    public HttpStatus deleteEmployeeDetailsById(@PathVariable  int id){
//        employeeService.deleteEmployeeDetailsById(id);
//        return HttpStatus.OK;
//
//    }
//
//    @DeleteMapping("/deleteByName/{employeeName}")
//    public HttpStatus deleteByName(@PathVariable String employeeName)
//    {
//        employeeService.deleteByEmployeeName(employeeName);
//        return HttpStatus.OK;
//    }
//
//    @PutMapping("/update/{id}")
//    public Employee updateEmployeeDetails(@PathVariable  int id, @RequestBody Employee employee)
//    {
//        Employee updated = employeeService.updateEmployeeDetails(id,employee);
//        return updated;
//    }
}
