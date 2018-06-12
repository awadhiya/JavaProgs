package oca.basics;
import java.util.Scanner;
public class CylinderMath {
	public static void main (String [] args){
		Scanner input = new Scanner (System.in);
		System.out.println("Enter the radius: ");
		double r = input.nextDouble();
		System.out.println("Enter the length: ");
		double l = input.nextDouble();
		double area = r * r * 3.14;
		double volume = l * area;
		System.out.println("The area is "+area+" while the volume is "+volume);
		input.close();
}
}