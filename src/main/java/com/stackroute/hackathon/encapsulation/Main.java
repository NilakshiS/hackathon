package com.stackroute.hackathon.encapsulation;

public class Main {

    public static void main(String[] args) {
        //printer object
        Printer printer=new Printer("laser",50,67,80,false);
        System.out.println(printer.isOutOfPaper(55));
        System.out.println(printer.isOutOfToner(55));
        printer.printPages(55);
    }
}
