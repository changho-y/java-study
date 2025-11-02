package test;

import java.util.Scanner;

public class Homework2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("A 입력 >> ");
		int a = sc.nextInt();
		System.out.print("B 입력 >> ");
		int b = sc.nextInt();
		int result = a-b;
		
		for(int i=0;a!=0 || b!=0;i++) {
			System.out.println("결과 >> "+result);
			
			System.out.print("A 입력 >> ");
			a = sc.nextInt();
			System.out.print("B 입력 >> ");
			b = sc.nextInt();
			result = a-b;
		}
	}

}
