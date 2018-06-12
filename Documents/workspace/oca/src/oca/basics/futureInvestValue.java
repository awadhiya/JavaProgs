package oca.basics;

import java.util.Scanner;
public class futureInvestValue {
public static void main (String [] args){
	Scanner in = new Scanner (System.in);
	System.out.println("Enter investment amount: ");
	double amnt = in.nextDouble();
	System.out.println("Enter annual interest rate: ");
	double rate = in.nextDouble();
	double monrate = rate / 120;
	System.out.println("Enter number of years: ");
	double year = in.nextDouble();
	double val1 = Math.pow((1+monrate), 12*year);
	double futValue = amnt * val1;
	System.out.println("Accumulated value is "+futValue);
	in.close();
}
}