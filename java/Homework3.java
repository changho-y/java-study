package test;

public class Homework3 {

	public static void main(String[] args) {
		int result = 0;
		
		for(int i=1;i<101;i++) {
			if(i%2==0) {
				result -= i;
				System.out.print(-i+" ");
			}else {
				System.out.print(i+" ");
				result += i;
			}
		}
		System.out.println("\r결과 : "+result);
	}

}
