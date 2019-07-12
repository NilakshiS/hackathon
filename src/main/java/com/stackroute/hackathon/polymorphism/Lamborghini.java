package com.stackroute.hackathon.polymorphism;

public class Lamborghini extends Car {
    //constructor
    public Lamborghini(int noOfCylinders, String name) {
        super(noOfCylinders, name);   //calling base class constructor
    }
   //overriding base class methods
    void startEngine()
    {
        System.out.println("Lamborghini Engine....");
    }
    void accelerate()
    {
        System.out.println("Lamborghini accelerates at 0 to 200 km / h in 3.8 seconds");
    }
    void brake()
    {
        System.out.println("Applied Brakes to Lamborghini...");
    }
}
