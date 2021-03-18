package com.company;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        System.out.println("The Object is to create some errors as practice:");
        System.out.println("This is the homework assignment: Enter Your Name Here: ");
        Scanner input = new Scanner(System.in);

        String homeworkAssignment = input.nextLine("");

        System.out.println("How did you learn your job skills?");
        String skills = input.nextLine();
        System.out.println("How many years will you need to be in your dream job?");
        String careerGoal = input.nextLine();

        System.out.printf("\n Here is the %s year planned goal for your career objective using your current method of learning through %s!", careerGoal, skills),


        int num1 = 2;
        {
            int num2 = 4;
            int result = num1 += num2;
            System.out.println("The sum is ", result);


        }

// operator: shortcuts
        if (sum > 13 && sum < 26) {
            System.out.println("Right in the sweet spot.");
        } else {
            System.out.println("Too little, too much.");
        }


// when comparing strings remember to use equals() method
        if (choice.equals("cash") || choice.equals("credit")) {
            System.out.println("Thanks for shopping at our store.");
        } else {
            System.out.println("Sorry, we don't accept checks.");
        }

    }

}