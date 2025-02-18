package java_jungol;

import java.util.Scanner;

public class Ex33 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] arr = new int[10];
		for (int i = 0; i < 10; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();

		int max = -1, min = 10001;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max && arr[i] < 100) {
				max = arr[i];
			}
			if (arr[i] < min && arr[i] >= 100) {
				min = arr[i];
			}
		}
		if (max == -1) {
			max = 100;
		}
		if (min == 100001) {
			min = 100;
		}
		System.out.println(max + " " + min);

	}
}