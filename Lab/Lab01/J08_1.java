// J08-1	for 문을 이용하여 1에서 10까지 덧셈으로 표시하는 합 프로그램
public class J08_1 {
	public static void main(String[] args) {
		int sum=0;
		
		for(int i=1; i<=10; i++) {	// 1~10까지 반복
			sum += i;
			System.out.print(i); // 더하는 수 출력
			if(i<=9) // 1~9가지는 '+' 출력
				System.out.print("+");
			else { // i가 10인 경우
				System.out.print("="); // '=' 출력하고
				System.out.print(sum); // 덧셈 결과 출력
			}
		}
	}

}
