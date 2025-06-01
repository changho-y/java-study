// J-24	 	상속 관계에 있는 클래스 간 멤버 접근
class Person {
	private int weight; 	// private 접근 지정. Student 클래스에서 접근 불가
	int age;				// 디폴트 접근 지정. Student 클래스에서 접근 가능
	protected int height; 	// protected 접근 지정. Student 클래스에서 접근 가능
	public String name;		// public 접근 지정. Student 클래스에서 접근 가능
	
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getWeight() {
		return weight;
	}
}

class Student extends Person{
	public void set() {
		age = 25; 		// 슈퍼 클래스의 디폴트 멤버 접근 가능
		name = "윤창호";  // 슈퍼 클래스의 public 멤버 접근 가능
		height = 175; 	// 슈퍼 클래스의 protected 멤버 접근 가능
		// weight = 70; // 오류. 슈퍼 클래스의 private 멤버 접근 불가
		setWeight(70); 	// private 멤버 weight 는 setWeight()으로 간접 접근
	}
}

public class InheritanceEx {
	public static void main(String[] args) {
		Student s = new Student();
		s.set();
	}
}
