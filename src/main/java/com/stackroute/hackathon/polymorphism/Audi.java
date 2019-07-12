package com.stackroute.hackathon.polymorphism;

public class Audi extends Car {
    //constructor
    public Audi(int noOfCylinders, String name) {
        super(noOfCylinders, name);   // calling Car class constructor
    }
  //overriding base class methods
    void startEngine()
    {
        System.out.println("Audi Engine....");
    }
    void accelerate()
    {
        System.out.println("Audi accelerates at 0 to 150 km / h in 3.8 seconds");
    }
    void brake()
    {
        System.out.println("Applied Brakes to Audi...");
    }
}
