/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solutions
 *  Copyright 2021 Crystal Gagne
 */
package org.example.ex17;

import java.util.Scanner;


public class Weight {
    Scanner in = new Scanner(System.in);
    public Double getWeight() {
        CheckInput weightCheckInput = new CheckInput();

        System.out.println("How much do you weigh (in lbs)?");
        String strUserWeight = in.nextLine();

        boolean checkInput = weightCheckInput.isDouble(strUserWeight);

        while (checkInput == false) {
            System.out.println("Please make sure you have a valid numeric input.\nPlease enter a valid weight.");
            strUserWeight = in.nextLine();

            checkInput = weightCheckInput.isDouble(strUserWeight);
        }

        double userWeight = Double.parseDouble(strUserWeight);

        if ((userWeight > 0) && (userWeight < 2000)) {
            return userWeight;
        } else {
            System.out.println("Please enter a valid weight.");
            return getWeight();
        }
    }
}
