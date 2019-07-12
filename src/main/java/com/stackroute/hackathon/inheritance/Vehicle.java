package com.stackroute.hackathon.inheritance;


// this is a base class for Vehicle
public class Vehicle {

    // properties of Vehicle
    private String name;
    private Float price;
    private String color;
    private int wheels;

    // getter and setter for all properties
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    // move method for all vehicles
    public void move(){
        System.out.println("The vehicle moves");
    }

}
