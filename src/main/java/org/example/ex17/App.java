/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solutions
 *  Copyright 2021 Crystal Gagne
 */

package org.example.ex17;

import java.util.Scanner;

public class App {
    Scanner in = new Scanner(System.in);

    public static void main(String[] args)
    {
        App mainApp = new App();
        Gender mainGender = new Gender();
        Weight mainWeight = new Weight();
        Calculations mainCalc = new Calculations();

        int gender = mainGender.getGender();
        double weight = mainWeight.getWeight();
        double alcoholAmount = mainApp.getAlcoholAmount();
        double hoursPassed = mainApp.getHoursPassed();
        double BAC = mainCalc.getBAC(weight, gender, alcoholAmount, hoursPassed);


        String outputString = genOutputString(BAC);
        System.out.println(outputString);
    }


    public Double getAlcoholAmount()
    {
        CheckInput alcoholCheckInput = new CheckInput();

        System.out.println("How much alcohol have you drank (in Oz)?");
        String strAlcoholAmount = in.nextLine();

        boolean checkInput = alcoholCheckInput.isDouble(strAlcoholAmount);

        while (checkInput == false) {
            System.out.println("Please make sure you have a valid numeric input.\nPlease enter how much alcohol you have drank.");
            strAlcoholAmount = in.nextLine();

            checkInput = alcoholCheckInput.isDouble(strAlcoholAmount);
        }

        double userAlcoholAmount = Double.parseDouble(strAlcoholAmount);

        if ((userAlcoholAmount >= 0) && (userAlcoholAmount < 2000)) {
            return userAlcoholAmount;
        } else {
            System.out.println("Please enter a valid amount of alcohol.");
            return getAlcoholAmount();
        }
    }

    public Double getHoursPassed()
    {
        CheckInput hrsPassedCheckInput = new CheckInput();
        System.out.println("How many hours have passed since your last drink?");
        String strHoursPassed = in.nextLine();

        boolean checkInput = hrsPassedCheckInput.isDouble(strHoursPassed);

        while (checkInput == false) {
            System.out.println("Please make sure you have a valid numeric input.\nPlease enter how many hours have passed.");
            strHoursPassed = in.nextLine();

            checkInput = hrsPassedCheckInput.isDouble(strHoursPassed);
        }

        double userHoursPassed = Double.parseDouble(strHoursPassed);

        if ((userHoursPassed >= 0) && (userHoursPassed < 2000)) {
            return userHoursPassed;
        } else {
            System.out.println("Please enter a valid number of hours.");
            return getHoursPassed();
        }
    }

    public static String genOutputString(double BAC)
    {
        if (BAC>0.0799)
            return String.format("Your BAC is %.2f.\nIt is not legal for you to drive.", BAC);
        else
            return String.format("Your BAC is %.2f.\nIt is legal for you to drive.", BAC);
    }
}

