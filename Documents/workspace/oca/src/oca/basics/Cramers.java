package oca.basics;
import java.util.Scanner;
public class Cramers {
public static void main (String [] args) {
	Scanner in = new Scanner (System.in);
	System.out.println("a:");
	double a = in.nextInt();
	System.out.println("b:");
	double b = in.nextInt();
	System.out.println("c:");
	double c = in.nextInt();
	System.out.println("d:");
	double d = in.nextInt();
	System.out.println("e:");
	double e = in.nextInt();
	System.out.println("f:");
	double f = in.nextInt();
	double x = ((e*d) - (b*f)) / ((a*d)-(b*f));
	double y = ((a*f) - (e*c)) / ((a*d) - (b*d));
	
	if ((a*d) - (b*c) == 0) {
		System.out.println("This system is unsolvable.");
		
	}
	else {
		System.out.println("X is: "+x);
		System.out.println("Y is: "+y);
	}
}
}
