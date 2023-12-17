package com.example.demo.model;

public class Address {
    private String street;
    private String city;
    private String state;
    private String zipCode;

    public Address(){

    }

    public Address(String street, String city, String state, String zipCode){
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    public void setStreet(String street){
        this.street = street;
    }

    public String getStreet(){
        return this.street;
    }

    public void setCity(String city){
        this.city = city;
    }

    public String getCity(){
        return this.city;
    }

    public String getState(){
        return this.state;
    }

    public void setState(String state){
        this.state = state;
    }
    public void setZipCode(String zipCode){
        this.zipCode = zipCode;
    }

    public String getZipCode(){
       return this.zipCode;
    }
}
