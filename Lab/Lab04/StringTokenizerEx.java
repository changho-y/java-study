// J-44			StringTokenizer 클래스 메소드 활용
import java.util.StringTokenizer;

public class StringTokenizerEx {
	public static void main(String[] args) {
		StringTokenizer st = new StringTokenizer("윤창호/박경리/최민성/박시우/윤샤브/윤러브", "/");
		
		while (st.hasMoreTokens())
			System.out.println(st.nextToken());
	}

}
