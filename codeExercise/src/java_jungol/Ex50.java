package java_jungol;

import java.util.Scanner;

public class Ex50 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		char arr[][] = new char[N][N];
		char ch = 'A';
		for (int i = 0; i < N; i++) {
			// 해당 루프의 종료는 j<n에 의해 결정됌. j가 종료되면 자동으로 k도 종료되는 로직
			for (int j = i, k = N - 1; j < N; j++, k--) {
				arr[j][k] = ch++;
				if (ch > 'Z') {
					ch = 'A';
				}
			}
		}
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (arr[i][j] == 0) {
					System.out.print("  "); // arr[i][j] + " " => A+" " 이므로 칸 당 공백 2개로 설정
				} else {
					System.out.print(arr[i][j] + " ");
				}
			}
			System.out.println();
		}
		sc.close();
	}

}
