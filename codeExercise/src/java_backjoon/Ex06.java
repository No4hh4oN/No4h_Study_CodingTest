package java_backjoon;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // N은 홀수
		int M = sc.nextInt();
		int targetX = 0, targetY = 0;
		sc.close();
		int[][] arr = new int[N][N];
		int startNum = N * N;
		int tryNum = 0;
		int sideLength = N - 1;
		while (true) {
			for (int i = tryNum; i < sideLength + tryNum; i++) {
				arr[i][tryNum] = startNum--;
			}
			for (int j = tryNum; j < sideLength + tryNum; j++) {
				arr[sideLength + tryNum][j] = startNum--;
			}
			for (int i = sideLength + tryNum; i > tryNum; i--) {
				arr[i][sideLength + tryNum] = startNum--;
			}
			for (int j = sideLength + tryNum; j > tryNum; j--) {
				arr[tryNum][j] = startNum--;
			}
			tryNum++;
			sideLength -= 2;
			if (sideLength == 0) {
				arr[N / 2][N / 2] = 1;
				break;
			}
		}

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				System.out.print(arr[i][j] + " ");
				if(arr[i][j] == M) {
					targetX = i + 1;
					targetY = j + 1;
				}
			}
			System.out.println();
		}
		System.out.println(targetX + " " + targetY);
	}
}
