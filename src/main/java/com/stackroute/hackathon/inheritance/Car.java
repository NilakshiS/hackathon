package com.stackroute.hackathon.inheritance;


// this is a subclass of vehicle which represent car
public class Car extends Vehicle {

    // property of car
    private String company;

    // getter setter methods
    public String getCompany() {
        return company;
    }

    public void setCompany(String model) {
        this.company = model;
    }

    // move method for car
    public void move(){
        System.out.println("The car moves");
    }

    // hand steer method for car
    public void handSteer(){
        System.out.println("Car's hand steering functionality");
    }

    // change gear method for car
    public void changeGear(){
        System.out.println("Car's changing gear functionality");
    }
}
