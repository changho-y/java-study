// J09-2	break 문을 이용하여 while 문 벗어나기
import java.util.Scanner;

public class J09_2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("exit를 입력하면 프로그램이 종료됩니다.");
		while(true) {
			System.out.print("입력: ");
			String text = scanner.nextLine(); // 한 라인 읽기
			if(text.equals("exit")) // exit 가 입력되면 반복 종료
				break; // while 문을 벗어남
		}
		System.out.println("종료됩니다. ");
		
		scanner.close();
	}
}
