// J07-3	다중 if-else 문으로 학점 매기기
import java.util.Scanner;

public class J07_3 {
	public static void main(String[] args) {
		char grade;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("점수를 입력하세요: ");
		int score = scanner.nextInt();
		if(score >= 90) // 점수가 90점 이상
			grade = 'A';
		else if(score >= 80)	// 점수가 80이상 90미만
			grade = 'B';
		else if(score >= 70)	// 점수가 70이상 80미만
			grade = 'C';
		else if(score >= 60)	// 점수가 60이상 70미만
			grade = 'D';
		else	//점수가 60미만
			grade = 'F';
		
		System.out.println("학점은 " + grade + "입니다.");
	}

}


