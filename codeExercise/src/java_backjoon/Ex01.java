//2741 N찍기
package java_backjoon;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // Scanner는 닫아주지 않으면 계속 입력을 받는 상태임, 그래서 close 해줘야함
		int n = sc.nextInt();
		sc.close(); // 이렇게 닫아주면 됨

		for (int i = 1; i <= n; i++) {
			System.out.println(i);
		}
	}
}