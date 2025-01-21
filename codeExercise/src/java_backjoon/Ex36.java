package java_backjoon;

import java.util.Scanner;

public class Ex36 {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int[] arr1 = new int[10];
		int count = 0;
		for(int i = 0; i < arr1.length; i++) {
			arr1[i] = sc.nextInt() % 42;
		}
		
		for(int i = 0; i < arr1.length-1; i++) {
			for(int j = i+1; j < arr1.length; j++) {
				if(arr1[i] == arr1[j]) {
					arr1[j] = -1;
				}
			}
		}
		
		for(int i = 0 ; i < arr1.length; i++) {
			if(arr1[i] != -1)
				count++;
		}
		
		System.out.println(count);
		sc.close();
		
	}
}