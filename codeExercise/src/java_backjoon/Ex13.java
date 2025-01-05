// 백준-1149-RGB거리
package java_backjoon;

import java.util.Scanner;

public class Ex13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[][] arr = new int[N][3];
		int lastIndex = -1;
		int total = 0;

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < 3; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

		int j;
		int outlastIndex = -1;
		
		for (int i = 0; i < N; i++) {
			int temp = 1001;
			for (j = 0; j < 3; j++) {
				if (temp > arr[i][j] && outlastIndex != j) {
					temp = arr[i][j];
					lastIndex = j;
				}
			}
			outlastIndex = lastIndex;
			System.out.println(outlastIndex);
			System.out.println(arr[i][outlastIndex]);
			total += arr[i][outlastIndex];
		}
		System.out.println(total);
		sc.close();
	}
}