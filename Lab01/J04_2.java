// 자동 타입 변환과 강제 타입 변환이 들어 있는 코드 작성

public class J04_2 {
	
	public static void main(String[] args) {
		byte b = 127;
		int i = 100;
		System.out.println(b+i);	// b가 int 타입으로 자동 변환
		System.out.println(10/4);	// 정수 나누기로 결과는 2
		System.out.println(10.0/4);	// 4가 4.0으로 자동 변환
		System.out.println((char)0x12340041);	// char로 변환된 결과 0x0041로서 문자 'A'
		System.out.println((byte)(b+i));
		System.out.println((int)2.9 + 1.8);
		System.out.println((int)(2.9 + 1.8));
		System.out.println((int)2.9 + (int)1.8);
	}
}
