package com.example.demo.model;

public class Employee {
    private long id;
    private String name;
    private Address address;

    public Employee(){

    }

    public Employee(long id, String name, Address address){
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public void setId(long id){
        this.id = id;
    }

    public long getId(){
        return this.id;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setAddress(Address address){
        this.address = address;
    }

    public Address getAddress(){
        return this.address;
    }
}
