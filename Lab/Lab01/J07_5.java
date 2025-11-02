// J07-5	학점 매기기 프로그램 switch 문 활용
import java.util.Scanner;

public class J07_5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		char grade;
		System.out.print("점수를 입력하세요: ");
		int score = scanner.nextInt();
		switch(score/10) {
			case 10:	// score = 100
			case 9:	// score >= 90
				grade = 'A';
				break;
			case 8:	//( score >= 80) && (score <90)
				grade ='B';
				break;
			case 7:	//( score >= 70) && (score <80)
				grade ='C';
				break;
			case 6:	//( score >= 60) && (score <70)
				grade ='D';
				break;
			default:	// score <60
				grade = 'F';
		}
		System.out.println("학점은 " + grade + "입니다.");
		
		scanner.close();
	}

}
