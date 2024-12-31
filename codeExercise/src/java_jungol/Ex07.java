// 정올-배열1-자가진단4 #558
package java_jungol;

import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[100];
		int N = 0;

		while (true) {
			arr[N] = sc.nextInt();
			if (arr[N] == 0)
				break;
			N++;
		}
		sc.close();

		for (int j = N - 1; j >= 0; j--) {
			System.out.print(arr[j] + " ");
		}
	}
}