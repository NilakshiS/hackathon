package com.stackroute.hackathon.inheritance;

public class Client {

    public static void main(String[] args) {
        Vehicle vehicle=new Vehicle();
        Vehicle car=new Car();
        HondaCity hondaCity=new HondaCity();

        vehicle.setName("Car");
        hondaCity.setColor("Black");
        hondaCity.setModel("Honda city vx");
        hondaCity.setPrice(Float.valueOf(12));


        System.out.println("The name of vehicle: "+vehicle.getName()+"\nThe Color of Car: "+hondaCity.getColor()+
                "\nThe Model of Honda city is: "+hondaCity.getModel()+"\nPrice of honda city in lacs: "+hondaCity.getPrice());
        System.out.println("The features of car are: ");
        vehicle.move();
        car.move();
        hondaCity.move();
        hondaCity.changeGear();
        hondaCity.handSteer();
    }

}
