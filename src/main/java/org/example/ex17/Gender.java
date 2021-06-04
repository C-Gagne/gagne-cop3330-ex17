/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solutions
 *  Copyright 2021 Crystal Gagne
 */

package org.example.ex17;

import java.util.Scanner;

public class Gender {

    Scanner in = new Scanner(System.in);
    public int getGender()
    {
        System.out.println("What is your gender?");
        String userGender = in.nextLine();

        if (userGender.equalsIgnoreCase("Female") || userGender.equalsIgnoreCase("F") || userGender.equalsIgnoreCase("Woman"))
        { return 0; }
        if (userGender.equalsIgnoreCase("Male") || userGender.equalsIgnoreCase("M") || userGender.equalsIgnoreCase("Man"))
        { return 1; }
        else
        {
            System.out.println("For the sake of this demonstration, this program only accepts male or female as a valid input.");
            return getGender();
        }
    }
}
