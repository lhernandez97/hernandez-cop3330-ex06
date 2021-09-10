/*
* UCF COP3330 Fall 2021 Assignment 1 Solution
* Copyright 2021 Luis Hernandez
*/

import java.util.Scanner;
//Getting Calendar class to show the current year without hard-coding it
import java.util.Calendar;

public class Exercise06 {
    public static void main(String[] args) {
        //create a Scanner
        Scanner input = new Scanner(System.in);
        //create a Calendar
        Calendar cal = Calendar.getInstance();
        //ask the user for their current age
        System.out.print("What is your current age? ");
        int cur_age = input.nextInt();
        //ask the user at what age they wish to retire
        System.out.print("At what age would you like to retire? ");
        int ret_age = input.nextInt();
        //calculate how many years left until retirement
        int years_left = ret_age - cur_age;
        //tell the user how long they have left until they can retire
        System.out.printf("You have %d years left until you can retire.%n", years_left);
        //tell the user the current year, and what year they will retire
        System.out.printf("The current year is %d, so you can retire in %d.", cal.get(Calendar.YEAR), (cal.get(Calendar.YEAR) + years_left));
    }
}
