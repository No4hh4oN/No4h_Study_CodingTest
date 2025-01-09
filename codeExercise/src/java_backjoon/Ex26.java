package java_backjoon;

import java.util.Scanner;

public class Ex26 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int X = sc.nextInt();
		
		int[] arr = new int [N];
		int index = 0;
		for(int i = 0; i < N; i++) {
			int num = sc.nextInt();
			if(num < X) {
				arr[index++] = num;
			}
		}
		sc.close();
		
		for(int i = 0; i< arr.length; i++) {
			if(arr[i] == 0) 
				break;
			System.out.print(arr[i] + " ");
		}
	}	
}