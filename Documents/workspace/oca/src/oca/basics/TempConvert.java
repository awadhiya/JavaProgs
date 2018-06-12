package oca.basics;
import java.util.Scanner;
public class TempConvert {
	public static void main (String [] args){
Scanner input = new Scanner (System.in);
System.out.print("Temperature in Celsius?");
double c = input.nextInt();
double f = 1.8 * c + 32;
System.out.println("The temperature in Farenheit is: " +f);
}
}