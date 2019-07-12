package com.stackroute.hackathon.polymorphism;

public class Mercedes extends Car {
    //constructor
    public Mercedes(int noOfCylinders, String name) {
        super(noOfCylinders, name); // calling Car class constructor
    }
    //overriding methods of Car class
    void startEngine()
    {
        System.out.println("Mercedes Engine....");
    }
    void accelerate()
    {
        System.out.println("Mercedes accelerates at 0 to 100 km / h in 3.8 seconds");
    }
    void brake()
    {
        System.out.println("Applied Brakes to mercedes...");
    }

}
