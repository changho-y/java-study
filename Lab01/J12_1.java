// J12-1	0으로 나누기 예외 발생으로 프로그램이 강제 종료되는 경우
import java.util.Scanner;

public class J12_1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int dividend; // 나뉨수
		int divisor; // 나눗수
		
		System.out.print("나뉨수를 입력하세요: ");
		dividend = scanner.nextInt();
		System.out.print("나눗수를 입력하세요: ");
		divisor = scanner.nextInt();
		System.out.println(dividend + "를 " + divisor + "로 나누면 몫은 "
				+ dividend/divisor + "입니다.");
		scanner.close();		
	}

}
