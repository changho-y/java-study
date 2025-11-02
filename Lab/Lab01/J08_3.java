// J08-3	'a'부터 'z'까지 출력하는 프로그램
public class J08_3 {
	public static void main(String[] args) {
		char c = 'a';
		
		do {
			System.out.print(c + " ");
			c = (char) (c + 1);	// 영문의 경우 1을 더하면 다음 문자의 코드 값
		} while (c <= 'z');
	}

}
