// J20-1	static 멤버를 객체의 멤버로 접근하는 경우
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

public class Ex1 {
	public static void main(String[] args) {
		StaticSample s1, s2;
		s1 = new StaticSample();
		s1.n = 5;
		s1.g();
		s1.m =50; // static
		s2 = new StaticSample();
		s2.n = 8;
		s2.h();
		s2.f(); // static
		System.out.println(s1.m);
	}

}
