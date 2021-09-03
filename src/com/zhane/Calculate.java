package com.zhane;

import java.util.Scanner;

public class Calculate {
    public void calculateBmi(){
        Scanner input = new Scanner(System.in);
        System.out.print("1. Metrics \n2. British " + "\nChoose your unit system : ");
        String str = input.nextLine();
        System.out.println("");

        switch (str){
            case "1":
                System.out.print("Input your weight in kilograms : ");
                double weight = input.nextDouble();
                if (weight < 0){
                    System.out.println("weight cant be negative" + "\n");
                    calculateBmi();
                }

                System.out.print("Input your height in centimeters : ");
                double height = input.nextDouble() / 100;
                if (height < 0){
                    System.out.println("height cant be negative" + "\n" + "Please start over" + "\n");
                    calculateBmi();
                }

                double bmi = weight / (height * height);
                System.out.println("Your body mass index is " + bmi);

                judgeBmi(bmi);

                break;

            case "2":
                System.out.print("Input your weight in pounds : ");
                double weight1 = input.nextDouble();
                if (weight1 < 0){
                    System.out.println("weight can't be negative" + "\n");
                    calculateBmi();
                }

                System.out.print("Input your height in inches : ");
                double height1 = input.nextDouble();
                if (height1 < 0){
                    System.out.println("height can't be negative" + "\n" + "Please start over" + "\n");
                    calculateBmi();
                }

                double bmi1 = (weight1 * 703) / (height1 * height1);
                System.out.println("Your body mass index is " + bmi1);

                judgeBmi(bmi1);

                break;

            default:
                System.out.println("Please select a valid option\n" + "Please start over\n");
                calculateBmi();
        }
    }

    public void judgeBmi(double a) {
        if ((a > 0) && (a <= 18)){
            System.out.println("You are underweight");
        }
        else if ((a > 18) && (a <= 24)){
            System.out.println("You are normal");
        }
        else if ((a > 24) && (a <= 29)){
            System.out.println("You are overweight");
        }
        else {
            System.out.println("You are obese");
        }
    }
}
