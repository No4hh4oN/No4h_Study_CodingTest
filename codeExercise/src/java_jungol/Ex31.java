package java_jungol;

import java.util.Scanner;

public class Ex31 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		for(int i = 0; i < 10; i++) {
			arr[i] = sc.nextInt();
		}
		int MIN = 1001;
		for(int i = 0; i < 10; i++) {
			if(arr[i] < MIN)
				MIN = arr[i];
		}
		System.out.println(MIN);
		
	}
}