package com.example.EmployeeDetail;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import model.Employee;
import service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    // API to show "Hello World"
    @GetMapping("/all")    
    public List<Employee> getAllEmployee(){
        List<Employee> employees = employeeService.getAllEmployee();
        // Print the list to the console
        System.out.println("Employees fetched: " + employees);
        return employees;
    }

//    // New API to search employees by name
//    @GetMapping("/all/search/{name}")
//    public Employee getEmployeeByName(@PathVariable String name) {
//        Employee employee = employeeService.getEmployeeByName(name);
//        // Print the employee fetched by name
//        System.out.println("Employee fetched by name (" + name + "): " + employee);
//        return employee;
//    }
}
