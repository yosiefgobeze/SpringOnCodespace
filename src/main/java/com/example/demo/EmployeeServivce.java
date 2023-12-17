package com.example.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.example.demo.model.Address;
import com.example.demo.model.Employee;

@Service
public class EmployeeServivce {
    List<Employee> employeesList = new ArrayList();

    public void addEmployee(){
        
        // add list of employees
        Address ad1 = new Address("50th street", "Emerville", "CA", "80904");
        Address ad2 = new Address("Buenovista", "Alameda", "CA", "78690");
        Address ad3 = new Address("Eagle street", "Berkeley", "CA", "78605");
        Address ad4 = new Address("jackson 345", "San Antonio", "TX", "56789");
        Address ad5 = new Address("Ali baba", "Houston", "TX", "78905");
        Address ad6 = new Address("Brookly 890", "Brookly", "NY", "78654");
        Address ad7 = new Address("New Hills", "Fairfield", "NY", "90897");
        Address ad8 = new Address("Ocean view 56", "Manhatan", "IA", "45673");
        Address ad9 = new Address("Ecinali", "Demoiness", "IA", "67543");
        Address ad10 = new Address("Central 67", "Beverley", "AR", "25673");

        
        Employee emp1 = new Employee(100, "Tekle", ad1);
        Employee emp2 = new Employee(200, "Aman", ad2);
        Employee emp3 = new Employee(300, "Elsabeth", ad3);
        Employee emp4 = new Employee(400, "Haben", ad4);
        Employee emp5 = new Employee(500, "Nguse", ad5);
        Employee emp6 = new Employee(100, "Jonh", ad6);
        Employee emp7 = new Employee(200, "Alexander", ad7);
        Employee emp8 = new Employee(300, "Inna", ad8);
        Employee emp9 = new Employee(400, "Mark", ad9);
        Employee emp10 = new Employee(500, "Senait", ad10);

        employeesList.add(emp1);
        employeesList.add(emp2);
        employeesList.add(emp3);
        employeesList.add(emp4);
        employeesList.add(emp5);
        employeesList.add(emp6);
        employeesList.add(emp7);
        employeesList.add(emp8);
        employeesList.add(emp9);
        employeesList.add(emp10);
    }   
    
    // this is a logic to retrieve all the employees
    public List<Employee> retrieveEmployees(){
        return employeesList;
    }

    // logic to retrieve employees by state
    public List<Employee> employeesByState(String state){
        List<Employee> employeesState = employeesList.stream().filter(e -> e.getAddress().getState().equals(state)).collect(Collectors.toList());
        return employeesState;
    }
    

}
