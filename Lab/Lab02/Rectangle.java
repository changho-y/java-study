// J14-2	Rectangle 클래스 만들기 연습
import java.util.Scanner;

public class Rectangle {
	int width;
	int height;
	
	public int getArea() {
		return width*height;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Rectangle rect = new Rectangle(); 	// 객체 생성
		
		System.out.print("너비를 입력하세요: ");
		rect.width = scanner.nextInt();
		System.out.print("높이를 입력하세요: ");
		rect.height = scanner.nextInt();
		
		System.out.println("사각형의 면적은 " + rect.getArea());
		scanner.close();
	}

}
