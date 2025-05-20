// J11-1	2차원 배열로 4년 평점 구하기
public class J11_1 {
	public static void main(String[] args) {
		double score [][] = {{3.3, 3.4}, 	// 학점 입력
							 {3.5, 3.6}, 
							 {3.7, 4.0}, 
							 {4.1, 4.2}}; 		
		double sum = 0;
		for(int year=0; year<score.length; year++) { // 각 학년별로 반복
			for(int term=0; term<score[year].length; term++) { // 학기별로 반복
				sum += score[year][term]; // 전체 평점 합
			}
		}
		int n = score.length; // 배열의 행 개수, 4학년
		int m = score[0].length; // 배열의 열 개수, 2학기
		
		System.out.println("4학년 전체 학점 평균은 " + sum/(n*m) + "입니다.");
	}

}
