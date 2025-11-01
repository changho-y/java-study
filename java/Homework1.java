package test;

import java.util.Scanner;

public class Homework1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("현재몸무게 : ");
		int now = sc.nextInt();
		
		System.out.print("목표몸무게 : ");
		int goal =sc.nextInt();

		int week = 0;
		
		for(int i=1; now> goal;i++) {
			System.out.print(i+"주차 감량 몸무게 : ");
			week = sc.nextInt();
			now -= week;
		}
		System.out.println(now+"kg 달성!! 축하합니다 !");
	}

}
