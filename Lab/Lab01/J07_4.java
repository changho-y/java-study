// J07-4	점수와 학년을 입력받아 합격 여부 판별하는 중첩 if-else 프로그램
import java.util.Scanner;

public class J07_4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("점수를 입력하세요: ");
		int score = scanner.nextInt();
		System.out.print("학년을 입력하세요: ");
		int year = scanner.nextInt();
		
		if(score >= 60) {	// 60점 이상
			if(year != 4) {	// 4학년이 아니면 합격
				System.out.println("합격입니다!");
			}
			else if(score >= 70) {	// 4학년 70점 이상
				System.out.println("합격입니다!");
			}
			else {
				System.out.println("불합격입니다.");
			}
		}
		else {
			System.out.println("불합격입니다.");
		}
	}

}
