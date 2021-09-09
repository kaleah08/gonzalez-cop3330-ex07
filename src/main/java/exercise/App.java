package exercise;

/*UCF COP3330 Fall 2021 Assignment 1 Solution
Copyright 2021 Kaleah Gonzalez */

import java.util.Scanner;


public class App 
{
    public static void main( String[] args )
    {

        Scanner input = new Scanner(System.in);
        System.out.print("What is the length of the room in feet? ");
        String firstString = input.next();
        int length = Integer.parseInt(firstString);

        System.out.print("What is the width of the room in feet? ");
        String secondString = input.next();
        int width = Integer.parseInt(secondString);

        System.out.println("You entered dimensions of " + length + " feet by " + width + " feet.");
        int areaFeet = length * width;
        final double conversion = 0.09290304;
        double areaMeters = areaFeet * conversion;
        areaMeters = (double)Math.round(areaMeters * 1000d) / 1000d;


        System.out.println("The area is "+ "\n" + areaFeet + " square feet" + "\n" + areaMeters + " square meters");


    }
}
