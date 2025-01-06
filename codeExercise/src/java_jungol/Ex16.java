package java_jungol;

import java.util.Scanner;

public class Ex16 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[3];
		for (int i = 0; i < 3; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		
		sum(arr[0], arr[1], arr[2]);
		avg(arr[0], arr[1], arr[2]);
	}

	static void sum(int n1, int n2, int n3) {
		System.out.println("sum : " + (n1 + n2 + n3));
	}

	static void avg(int n1, int n2, int n3) {
		System.out.println("avg : " + (n1 + n2 + n3) / 3);
	}
}
