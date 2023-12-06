package com.example.demo.model;

public class Address {
    private String street;
    private String city;
    private String zipCode;

    public Address(){

    }

    public Address(String street, String city, String zipCode){
        this.street = street;
        this.city = city;
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

    public void setZipCode(String zipCode){
        this.zipCode = zipCode;
    }

    public String getZipCode(){
       return this.zipCode;
    }
}
