package com.stackroute.hackathon.encapsulation;

public class Printer {

    //properties
    private String name;
    private int no_of_pages_printed;
    private double toner_level;
    private int ammountOfPaper;
    private boolean isDoubleSided;

    //constructor
    public Printer(String name, int no_of_pages_printed, double toner_level,int ammountOfPaper, boolean isDoubleSided) {
        this.name = name;
        this.no_of_pages_printed = no_of_pages_printed;
        if(toner_level >= 0 && toner_level <= 100)
        {this.toner_level = toner_level;}
        this.isDoubleSided = isDoubleSided;
        this.ammountOfPaper = ammountOfPaper;
    }

    //To check if printer is out of toner level
    public boolean isOutOfToner(double numberToPrint) {
        return (toner_level - (numberToPrint / 2) < 0);
    }

    //To check if printer is out of paper
    public boolean isOutOfPaper(double numberToPrint) {
        return (((ammountOfPaper - numberToPrint) < 0));
    }

    //To print the details of the printer
    public void showPages(){
        System.out.println("Pages remaining is: " + this.ammountOfPaper
                + " Toner level is: " + this.toner_level + " If the printer is duplex: " + this.isDoubleSided);
    }

    public void printPages(double numberToPrint) {
        if (toner_level<= 0) {
            System.out.println("Out of toner");
        }
        if (ammountOfPaper == 0) {
            System.out.println("Out of Paper");
        } else if (!isOutOfToner(numberToPrint) && (!isOutOfPaper(numberToPrint))) {
            ammountOfPaper -= numberToPrint;
            toner_level = toner_level - (numberToPrint / 2);
            showPages();
        }
    }
}
