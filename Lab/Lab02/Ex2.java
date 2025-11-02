// J20-2	static 멤버를 클래스 이름으로 접근
class StaticSample{
	public int n;
	public void g() {
		m = 20;
	}
	public void h() {
		m = 30;
	}
	public static int m;
	public static void f() {
		m = 5;
	}
}

public class Ex2 {
	public static void main(String[] args) {
		StaticSample.m = 10;
		
		StaticSample s1;
		s1 = new StaticSample();
		System.out.println(s1.m);
		s1.f();
		StaticSample.f();
	}

}
