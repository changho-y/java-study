// J08-2	while 문을 이용한 -1이 입력될 때까지 입력된 수의 평균 구하는 프로그램
import java.util.Scanner;

public class J08_2 {
	public static void main(String[] args) {
		int count=0;	// count 는 입력된 정수의 개수
		int sum=0;	// sum 은 합
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("정수를 입력하고 마지막에 -1을 입력하세요.");
		
		int n = scanner.nextInt(); // 정수 입력
		while(n != -1) {	// -1이 입력되면 while 문을 벗어남
			sum += n;
			count++;
			n = scanner.nextInt();	// 정수 입력
		}
		if(count == 0)
			System.out.println("입력된 정수가 없습니다. ");
		else {
			System.out.print("정수의 개수는 " + count + "개이며 ");
			System.out.println("평균은 " + (double)sum/count + "입니다.");
		}
		scanner.close();
	}

}

