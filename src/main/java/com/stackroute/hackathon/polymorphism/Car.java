package com.stackroute.hackathon.polymorphism;

public class Car {

    //data variables of Car class
    private int noOfCylinders;
    private String name;
    private boolean engine;
    private int wheels;
    //default constructor
    public Car(){}

    public Car(int noOfCylinders, String name) {
        this.noOfCylinders = noOfCylinders;
        this.name = name;
        wheels = 4;
        engine = true;
    }
    //getters and setters
    public int getNoOfCylinders() {
        return noOfCylinders;
    }

    public void setNoOfCylinders(int noOfCylinders) {
        this.noOfCylinders = noOfCylinders;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    //methods
    void startEngine()
    {
        System.out.println("Engine is started......");
    }
    void accelerate()
    {
        System.out.println("Car accelerated......");
    }
    void brake()
    {
        System.out.println("Applied brake......");
    }

}
