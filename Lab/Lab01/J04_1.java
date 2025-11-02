// 상수 PI를 선언하고 원의 면적을 구하는 프로그램

public class J04_1 {
	
	public static void main(String[] args) {
		final double PI = 3.14;	// 원주율을 상수로 선언
		
		double radius = 10.0;	// 원의 반지름
		double circleArea = radius*radius*PI;	// 원의 면적 계산
		
		// 출력
		System.out.println("원의 면적 = " + circleArea);
	}
}
