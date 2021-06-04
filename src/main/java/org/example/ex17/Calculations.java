/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solutions
 *  Copyright 2021 Crystal Gagne
 */

/*
 Calculate your blood alcohol content (BAC) using this formula

BAC = (A × 5.14 / W × r) − .015 × H

where

    A is total alcohol consumed, in ounces (oz).
    W is body weight in pounds.
    r is the alcohol distribution ratio:
        0.73 for men
        0.66 for women
    H is number of hours since the last drink.

Display whether or not it’s legal to drive by comparing the blood alcohol content to 0.08.
 */
package org.example.ex17;

public class Calculations
{
    public Double getBAC(double weight, int gender, double alcoholAmount, double hoursPassed)
    {
        double r =0.00;
        if (gender == 0)
            r = 0.66;
        if (gender == 1)
            r = 0.73;

        double bloodAlcoholLvl = (alcoholAmount * 5.14 / weight * r) - (0.015 * hoursPassed);
        return bloodAlcoholLvl;
    }
}
