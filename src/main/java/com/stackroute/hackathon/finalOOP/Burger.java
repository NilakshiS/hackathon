package com.stackroute.hackathon.finalOOP;

import java.util.HashMap;
import java.util.Map;

public class Burger {
    String breadRollType;
    String meatType;
    Double basePrice;
    HashMap<String ,Double> additions;

    public int getMaxAddons(){
        return 4;
    }

    public Burger(){
        basePrice = 120.0;
        additions = new HashMap<>();
    }

    public String getBreadRollType() {
        return breadRollType;
    }

    public void setBreadRollType(String breadRollType) {
        this.breadRollType = breadRollType;
    }

    public String getMeatType() {
        return meatType;
    }

    public void setMeatType(String meatType) {
        this.meatType = meatType;
    }

    public HashMap<String, Double> getAdditions() {
        return additions;
    }

    public void setAdditions(HashMap<String, Double> additions) {
        this.additions = additions;
    }

    @Override
    public String toString() {
        return "Burger{" +
                "breadRollType='" + breadRollType + '\'' +
                ", meatType='" + meatType + '\'' +
                ", additions=" + additions +
                '}';
    }

    public void printBill(){
        double total = basePrice;
        System.out.println("Base Price: "+basePrice);
        System.out.println("------------------------");
        System.out.println("Add-ons:");
        for (Map.Entry<String, Double> entry : additions.entrySet()) {
            total += entry.getValue();
            System.out.print(entry.getKey());
            System.out.print("         ");
            System.out.println(entry.getValue());
        }
        System.out.println("------------------------");
        System.out.print("total:");
        System.out.print("         ");
        System.out.println(total);
    }
}
