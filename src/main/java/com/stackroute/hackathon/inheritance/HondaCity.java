package com.stackroute.hackathon.inheritance;

public class HondaCity extends Car {

    private String model;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void move() {
        System.out.println("The honda city car moves at max speed of 200kmph and min speed of 10kmph");
    }

    public void handSteer() {
        System.out.println("Honda city has Power Steering");
    }

    public void changeGear() {
        System.out.println("As per Honda's recommendation, the following are the gear change speeds.\n" +
                "1st to 2nd - 24kmph\n" +
                "2nd to 3rd - 40kmph\n" +
                "3rd to 4th - 64kmph\n" +
                "4th to 5th - 75kmph");
    }
}
