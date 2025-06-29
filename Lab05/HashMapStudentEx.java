// J-51 		HashMap
import java.util.*;

class Student{
	private int id;
	private String tel;
	public Student(int id, String tel) {
		this.id = id;
		this.tel = tel;
	}
	public int getId() { return id;	}
	public String getTel() { return tel; }
}

public class HashMapStudentEx {
	public static void main(String[] args) {
		HashMap<String, Student> map = new HashMap<String, Student>();
		map.put("윤창호", new Student(1, "010-2103-xxxx"));
		map.put("윤치훈", new Student(2, "010-2104-xxxx"));
		map.put("윤도영", new Student(3, "010-2105-xxxx"));
		
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.print("검색할 이름을 입력하세요: ");
			String name = scanner.nextLine();
			if(name.equals("exit"))
				break;
			Student student = map.get(name);
			if(student == null)
				System.out.println(name + "은 없는 사람입니다.");
			else
				System.out.println("id: " + student.getId() + ", 전화번호: " + student.getTel());
		}
		scanner.close();

	}
}
