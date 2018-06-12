package oca.basics;
import java.util.Scanner;
public class Interest {
public static void main (String [] args){
	Scanner in = new Scanner (System.in);
	System.out.println("What is your base investment?");
	double base = in.nextInt();
	System.out.println("FOr how many months does it gather interest?");
	double month = in.nextInt();
	base = base *  (1 + 0.00417) * month;
	System.out.println("Your total savings now is: "+base);
	in.close();
}
}
