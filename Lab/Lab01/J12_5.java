// J12-5	정수가 아닌 문자열을 정수로 변환할 때 예외 발생(NumberFormatException)
public class J12_5 {
	public static void main(String[] args) {
		String [] stringNumber = {"23", "12", "3.141592", "998"};
		
		int i = 0;
		try {
			for(i=0; i<stringNumber.length; i++) {
				int j = Integer.parseInt(stringNumber[i]); // 예외 발생
				System.out.println("정수로 반환된 값은 " + j);
			}
		}
		catch (NumberFormatException e) {
			System.out.println(stringNumber[i] +"는 정수로 반환할 수 없습니다.");
		}
	}

}
