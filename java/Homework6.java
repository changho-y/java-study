package test;

import java.util.Random;
import java.util.Scanner;

public class Homework6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		
		System.out.println("숫자맞추기게임! 1~99에서 하나만 입력하세요.");
		
		int result = rd.nextInt(100);
		int user = result+1;

		for(int i=0;result!=user;i++) {
			System.out.print("숫자를 입력하세요 >>");
			user = sc.nextInt();
			if(user<result) {
				System.out.println("업!");
			}else if(user>result) {
				System.out.println("다운!");
			}else {
				System.out.println("정답입니다!");
			}
		}

	}

}
