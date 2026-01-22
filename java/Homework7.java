package test;

import java.util.Random;
import java.util.Scanner;

public class Homework7 {

	public static void main(String[] args) {
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[8];
		
		System.out.print("배열에 있는 모든 값 : ");
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = rd.nextInt(100);
			System.out.print(arr[i]+" ");
		}
		int big = arr[0];
		int small = arr[0];
		for(int j=0; j<arr.length; j++) {
			if(big<arr[j]) {
				big = arr[j];
			}else if(small>arr[j]){
				small = arr[j];
			}
		}
		System.out.println("\r가장 큰 값 : "+big);
		System.out.println("가장 작은 값 : "+small);
	}

}
