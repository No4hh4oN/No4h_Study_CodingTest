package java_jungol;

import java.util.Scanner;

public class Ex46 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int N = scanner.nextInt();
		int num = 1;
		int[][] arr = new int[N][N];
		scanner.close();
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				arr[j][i] = num++;
			}
		}

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}