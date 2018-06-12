package oca.basics;

import java.util.Scanner;
public class InterestCalc {
public static void main (String [] args){
	Scanner in = new Scanner (System.in);
	System.out.println("What is your base investment?");
	double base = in.nextDouble();
	System.out.println("What is annual percentage interest rate?");
	double annrate = in.nextDouble();
	double interest = base * ( annrate / 1200);
	System.out.println("The interest next month will be "+interest);
	in.close();
}
}