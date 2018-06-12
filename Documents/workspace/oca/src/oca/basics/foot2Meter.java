package oca.basics;

import java.util.Scanner;


public class foot2Meter {
	public static void main (String [] args){
		Scanner input = new Scanner (System.in);
		System.out.println("Feet? ");
		double f = input.nextDouble();
		double m = f / 0.305 ;
		System.out.println("The conversion to meter is "+m);
		input.close();
	}
}
