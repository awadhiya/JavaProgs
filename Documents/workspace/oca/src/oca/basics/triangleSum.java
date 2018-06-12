package oca.basics;
import java.util.Scanner;
public class triangleSum {
public static void main (String [] args) {
	Scanner in = new Scanner (System.in);
	System.out.println("Enter side 1: ");
	double s1 = in.nextInt();
	System.out.println("Enter side 2: ");
	double s2 = in.nextInt();
	System.out.println("Enter side 3: ");
	double s3 = in.nextInt();
	if (s1+s2 > s3 && s2+s3 > s1 && s1+s3>s2 ){
		System.out.println("Valid triangle.");
		
	} else {
		System.out.println("Not valid.");
	}
}
}
