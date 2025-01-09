// 백준-
package java_backjoon;

import java.util.Scanner;

public class Ex11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long[][] arr = new long[N][2];
		
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < 2; j++) {
				arr[i][j] = sc.nextLong();
			}
		}
		sc.close();
		int total = 0;
		for(int i = 0; i < N-1; i++) {
			long temp = 0;
			for(int j = 0; j < 2; j++) {
				temp = (arr[i+1][j] - arr[i][j]) * (arr[i+1][j] - arr[i][j]);
			}
			total += Math.sqrt(temp);
		}
		System.out.println(total);
	}
}

//틀림 왜징