// J15-1	두 개의 생성자를 가진 Circle 클래스
public class Circle2 {
	int radius;
	String name;
	
	public Circle2() {	// 매개 변수 없는 생성자
		radius = 1;	
		name = ""; 		// 필드 초기화
	}
	
	public Circle2(int r, String n) { // 매개 변수를 가진 생성자
		radius = r;
		name = n;		// 매개 변수로 필드 초기화
	}
	
	public double getArea() {
		return 3.14*radius*radius;
	}

	public static void main(String[] args) {
		Circle2 pizza = new Circle2(10, "자바피자"); 	/// 객체 생성. 반지름을 10으로, 이름을 "자바피자"로 초기화
		
		double area = pizza.getArea();
		System.out.println(pizza.name + "의 면적은 "+ area);
		
		Circle2 donut = new Circle2();	// 객체 생성. 반지름을 1, 이름을 ""로 초기화
		donut.name = "도넛피자";			// 이름 변경
		area = donut.getArea();
		System.out.println(donut.name + "의 면적은 " + area);
	}

}
