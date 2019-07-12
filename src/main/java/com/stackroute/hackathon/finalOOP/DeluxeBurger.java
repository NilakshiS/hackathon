package com.stackroute.hackathon.finalOOP;

public class DeluxeBurger extends Burger {
    public DeluxeBurger(){
        super();
        basePrice = 150.0;
        additions.put("Chips",50.0);
        additions.put("Drink",40.0);
    }

    public int getMaxAddons(){
        return 4;
    }
}
