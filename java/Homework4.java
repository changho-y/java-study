package test;

import java.util.Scanner;

class Homework4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("단수입력 :");
		int a = sc.nextInt();
		
		System.out.println("어느 수까지 출력 :");
		int b = sc.nextInt();
		
		System.out.println(a+"단");
		for(int i=1;i<=b;i++) {
			int result = a*i;
			System.out.println(a+"*"+i+"="+result);
		}
	}

}
