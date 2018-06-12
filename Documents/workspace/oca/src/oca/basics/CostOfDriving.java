package oca.basics;

import java.util.Scanner;
public class CostOfDriving {
	public static void main (String [] args){
		Scanner in = new Scanner (System.in);
		System.out.println("Distance to go: ");
		double distance = in.nextDouble();
		System.out.println("Miles per gallon?");
		double mpg = in.nextDouble();
		System.out.println("Price per gallon: ");
		double ppg = in.nextDouble();
		double galReq = distance / mpg;
		double totalPrice = galReq * ppg;
		System.out.println("The cost of the trip will be: "+totalPrice);
		in.close();
	}
}
