// J-42		String 클래스 메소드 활용
public class StringEx {
	public static void main(String[] args) {
		String a = new String(" Java$");
		String b = new String(",Java++ ");
		
		System.out.println(a + "의 길이는 " + a.length());
		System.out.println(a.contains("$"));
		
		a = a.concat(b);
		System.out.println(a);
		
		a = a.trim();
		System.out.println(a);
		
		a = a.replace("Java$", "Java");
		System.out.println(a);
		
		String s[] = a.split(",");
		for (int i=0; i<s.length; i++)
			System.out.println("분리된 문자열" + i + ": " + s[i]);
		
		a = a.substring(5);
		System.out.println(a);
		
		char c = a.charAt(1);
		System.out.println(c);

	}
}
