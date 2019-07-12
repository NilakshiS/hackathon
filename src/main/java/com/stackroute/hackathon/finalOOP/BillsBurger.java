package com.stackroute.hackathon.finalOOP;

import java.util.*;

public class BillsBurger {
    public static void main(String[] args) {
        List<String> addons=  new ArrayList<>();
        HashMap<String ,Double> availableAddons = new HashMap<>(6);
        availableAddons.put("lettuce",15.0);
        availableAddons.put("carrot",20.0);
        availableAddons.put("tomato",10.0);
        availableAddons.put("mayo",10.0);
        availableAddons.put("cheese",25.0);
        availableAddons.put("jalapenos",15.0);

        Burger burger = new Burger();
        System.out.println("Welcome to Bill Burgers\n Choose One of The Burgers");
        System.out.println("1. Basic Burger");
        System.out.println("2. Healthy Burger");
        System.out.println("3. Deluxe Burger with chips and drink");
        System.out.println("Enter your choice: ");
        Scanner input = new Scanner(System.in);
        switch (input.nextInt()){
            case 1: burger = new Burger();
                break;
            case 2: burger = new HealthyBurgers();
                break;
            case 3: burger = new DeluxeBurger();
                break;
            default:
                System.out.println("Incorrect Choice!");
        }

        System.out.println();
        System.out.println("Available Addons: ");
        for (String addon:availableAddons.keySet()
             ) {
            System.out.println(addon);
        }
        System.out.println();
        System.out.println("Please enter addons (Maximum addons allowed:"+burger.getMaxAddons()+" )");
        for (int i = 0; i<= burger.getMaxAddons();i++){
            addons.add(input.nextLine());
        }

        for (Map.Entry<String, Double> entry : availableAddons.entrySet()) {
            if (addons.contains(entry.getKey())){
                burger.additions.put(entry.getKey(),entry.getValue());
            }
        }

        System.out.println("\n\n");
        System.out.println("Bill");
        burger.printBill();

    }
}
