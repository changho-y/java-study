// J07-1	단순 if 문을 사용하여 시험점수가 80점 이상이라면 합격을 판별하는 프로그램

import java.util.Scanner;

public class J07_1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("점수를 입력하세요: ");
		
		int score = scanner.nextInt();
		
		if(score >= 80)
			System.out.println("축하합니다! 합격입니다!!");
		
		scanner.close();
		
	}

}
