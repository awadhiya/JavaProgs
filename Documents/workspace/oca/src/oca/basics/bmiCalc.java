package oca.basics;

import java.util.Scanner;
public class bmiCalc {
public static void main (String [] args){
	Scanner in = new Scanner (System.in);
	System.out.println("What is your weight in pounds?");
	double base = in.nextDouble();
	double kilo = base * 0.45359237;
    System.out.println("What's ya height in inches?");
    double height = in.nextDouble();
    double meter = height *  0.0254;
    double bmi = kilo /( meter * meter);
    System.out.println("Your BMI is "+bmi);
    if (bmi < 18.5) {
    	 System.out.println("Underweight");
    }else if (bmi < 25){
    	 System.out.println("Normal");
    } else if (bmi < 30){
    	 System.out.println("Overweight");
    } else{
    	 System.out.println("Obese");
    	 }
    in.close();
    
}
}