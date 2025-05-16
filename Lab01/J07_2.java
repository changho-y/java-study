// J07-2	입력된 수가 3의 배수인지 판별하는 프로그램
import java.util.Scanner;

public class J07_2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("수를 입력하세요: ");
		int number = scanner.nextInt();
		if (number%3 == 0) {	// number 를 3으로 나눴을 때 나머지가 0이면
			System.out.println(number + "은 3의 배수입니다.");
		}
		else {
			System.out.println(number + "은 3의 배수가 아닙니다.");
		}
		scanner.close();
	}

}
