package com.pluarlsight;

public class MathApp {
    public static void main(String[] args) {
        //question 1
        int bobSalary = 25000;
        int garySalary = 35000;
        int highestSalary = 0;
        highestSalary = Math.max(bobSalary,garySalary);
        System.out.println(highestSalary);
        //question 2
        int carPrice = 2500;
        int truckPrice = 5500;
        int lowestPrice = 0;
        lowestPrice = Math.min(carPrice,truckPrice);
        System.out.println(lowestPrice);
        //question 3
        double radius = 7.25;
        System.out.println(Math.PI*Math.pow(radius,2));
        //question 4
        double square_root = 5.0;
        System.out.println(Math.sqrt(square_root));
        //question 5
        int x1 = 5;
        int y1 = 10;
        int x2 = 85;
        int y2 = 50;
        System.out.println(Math.sqrt((y2 - y1) * (y2 - y1) + (x2 - x1) * (x2 - x1)));
        //question 6
        double absolutePositiveValue = -3.8;
        System.out.println("Absolute positive value is " + Math.abs(absolutePositiveValue));
        //question 7
        double randomNumber = Math.random();
        System.out.println("Random number between 0 and 1 is " + randomNumber);









    }
}