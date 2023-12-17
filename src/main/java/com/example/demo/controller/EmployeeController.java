package com.example.demo.controller;
//import java.util.ArrayList;
import java.util.List;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.EmployeeServivce;
//import com.example.demo.model.Address;
import com.example.demo.model.Employee;

@RestController
public class EmployeeController {

    private final EmployeeServivce employeeServivce;

    public EmployeeController(EmployeeServivce employeeServivce){
        this.employeeServivce = employeeServivce;
    }

    @GetMapping
    public List<Employee> getEmployees(){
        return employeeServivce.retrieveEmployees();
    }

    @GetMapping(path = "/bystate")
    public List<Employee> getEmployeesByState(@RequestParam String state){
        return this.employeeServivce.employeesByState(state);
    }

    @GetMapping("/add")
    public void addEmployees(){
        employeeServivce.addEmployee();
    }   
}
