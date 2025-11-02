// J-52 		제네릭 메소드
public class GenericMethodEx {
	public static <T> GStack<T> reverse(GStack<T> a){
		
		GStack<T> s = new GStack<T>();
		while (true) {
			T tmp;
			tmp = a.pop();
			if (tmp == null)
				break;
			else
				s.push(tmp);
		}
		return s;
	}
	public static void main(String[] args) {
		GStack<Double> gs = new GStack<Double>();
		
		for(int i=0; i<5; i++) {
			gs.push(new Double(i));
		}
		gs = reverse(gs);
		for(int i=0; i<5; i++) {
			System.out.println(gs.pop());
		}
	}
}
