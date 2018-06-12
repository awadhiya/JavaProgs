package oca.basics;
import java.util.Scanner;
public class Minutes2Years {
	public static void main (String [] args){
Scanner in = new Scanner (System.in);
System.out.println("Enter the number of minutes");
int minute = in.nextInt();
int year = minute /525949;
System.out.println("Those minutes add up to approx. "+year+"years.");
in.close();
}
}