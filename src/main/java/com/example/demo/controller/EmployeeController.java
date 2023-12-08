package com.example.demo.controller;
import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.model.Address;
import com.example.demo.model.Employee;

@RestController
//@RequestMapping
public class EmployeeController {

    private final List<Employee> employees = new ArrayList<>();

    @GetMapping
    public List<Employee> getEmployees(){
        System.out.println("Here ..................");
        return employees;
    }

    @GetMapping("/add")
    public void addEmployees(){
        Address ad1 = new Address("50th street", "Emerville, CA", "80904");
        Address ad2 = new Address("Buenovista", "Alameda, CA", "78690");
        Address ad3 = new Address("Eagle street", "Berkeley, CA", "78605");

        Employee emp1 = new Employee(100, "Tekle", ad1);
        Employee emp2 = new Employee(200, "Aman", ad2);
        Employee emp3 = new Employee(300, "Elsabeth", ad3);

        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);
    }   
}
