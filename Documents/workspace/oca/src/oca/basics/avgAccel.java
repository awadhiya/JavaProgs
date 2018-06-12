package oca.basics;
import java.util.Scanner;
public class avgAccel {
public static void main (String [] args){
	Scanner in = new Scanner (System.in);
	System.out.println("Enter Vo (m/s): ");
	int vo = in.nextInt();
	System.out.println("Enter Vf(m/s): ");
	int vf= in.nextInt();
	System.out.println("Enter time(s): ");
	int t = in.nextInt();
	double accel = (vf - vo ) / t;
	System.out.println("The average acceleration is" + accel+ "meters/second squared.");
	in.close();
}

}
