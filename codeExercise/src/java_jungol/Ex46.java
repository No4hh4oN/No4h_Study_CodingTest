package java_jungol;

import java.util.Scanner;

public class Ex46 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		int C = scanner.nextInt();

		int N = A * B * C; // 세 수의 곱 계산
		int[] count = new int[10]; // 0~9까지 등장 횟수를 저장할 배열

		String numStr = String.valueOf(N); // 정수를 문자열로 변환

		for (char digit : numStr.toCharArray()) {
			count[digit - '0']++; // 해당 숫자의 카운트를 증가
		}

		// 0부터 9까지의 등장 횟수 출력
		for (int i = 0; i < 10; i++) {
			System.out.println(count[i]);
		}
	}
}