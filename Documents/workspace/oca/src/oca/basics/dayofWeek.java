package oca.basics;
import java.util.Scanner;
public class dayofWeek {
public static void main (String [] args){
	Scanner in = new Scanner (System.in);
	System.out.println("What is today's day, if Sunday is 0 and Saturday is 6? ");
	int day = in.nextInt();
	System.out.println("How many days from now do you want to know about? ");
	int fut = in.nextInt();
	int max = 6;
	int min = 0;
	int range = (max - min) +1;
	switch (day) {
	
	case (0):
		System.out.println("Sunday");
	break;
	case (1):
		System.out.println("Monday");
	break;
	case (2):
		System.out.println("Tuesday");
	break;
	case (3):
		System.out.println("Wednesday");
	break;
	case (4):
		System.out.println("Thursday");
	break;
	case (5):
		System.out.println("Friday");
	break;
	case (6):
		System.out.println("Saturday");
	break;
}
}
}
