package com.stackroute.hackathon.polymorphism;

public class MainClass {
    public static void main(String[] args) {
        //the same object of Car class is used here to refer to the sub classes
        //Mercedes sub class
        Car car = new Mercedes(4,"Mercedes");
        car.brake();
        car.startEngine();
        car.accelerate();
        //Audi sub class
        car = new Audi(5,"Audi");
        car.brake();
        car.startEngine();
        car.accelerate();
        //Lamborghini sub class
        car = new Lamborghini(12,"Lamborghini");
        car.brake();
        car.startEngine();
        car.accelerate();

    }
}
