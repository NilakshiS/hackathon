package com.stackroute.hackathon.finalOOP;

public class HealthyBurgers extends Burger{
    public HealthyBurgers(){
        super();
        basePrice = 130.0;
        breadRollType = "Brown Rye Bread Roll";
    }

    public int getMaxAddons(){
        return 6;
    }

}
