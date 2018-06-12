package oca.basics;

import java.util.Scanner;
public class RandomInt {
               
               public static void main(String[] args) {
                 Scanner input = new Scanner( System.in );
System.out.print("Enter a random integer between 0 and 1000");
int x = input.nextInt();
int y = x % 10;
int z = x / 10 / 10;
int t = x / 10;
int sum = t + z + y;
System.out.println(sum);
               }
}
