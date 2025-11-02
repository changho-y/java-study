// J-02
public class J02 { // 클래스
	// 메소드
	public static int sum(int n, int m) { 	// 매개변수 n, m
		return n + m;                      	//  n과 m의 합 리턴
	}
	// main() 메소드에서 실행 시작
	public static void main(String[] args) {
		int i = 20;                      	// 변수 선언
		int s;
		char a;
	
		s = sum(i, 10);						// 메소드 호출
		a = '?';
		System.out.println(a);				// 문자 '?' 출력
		System.out.println("Hello");		// "Hello" 문자열 출력
		System.out.println(s);				// 정수 s 값 30 출력
	}
}