// J07-6	switch 문을 활용한 커피 메뉴 가격을 알려주는 프로그램
import java.util.Scanner;

public class J07_6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("무슨 커피를 드릴까요? ");
		String order = scanner.next();
		int price = 0;
		switch(order) {
			case "에스프레소":
			case "카푸치노":
			case "카페라떼":
				price = 3500;
				break;
			case "아메리카노":
				price = 2000;
				break;
			default:
				System.out.println("메뉴에 없습니다!");
		}
		if(price != 0) {
			System.out.println(order + "는 " + price + "원입니다.");
		}
		scanner.close();
	}

}
