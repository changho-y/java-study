package test;

import java.util.Random;
import java.util.Scanner;

public class Homework5 {

	public static void main(String[] args) {
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		
		int over = 0;
		
		for(int j = 0;over!=5; j++) {
			int a = rd.nextInt(10);
			int b = rd.nextInt(10);
			
			System.out.print(a+" + "+b+" = ");
			int user = sc.nextInt();
			int result = a+b;
			if(user==result) {
				System.out.println("SUCCESS!");
			} else {
				over++;
				System.out.println("Fail...");
			}
		}
		System.out.println("GAME OVER!");
	}

}
