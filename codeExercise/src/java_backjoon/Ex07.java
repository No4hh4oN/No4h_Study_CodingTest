package java_backjoon;

import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt(); // 입력 값
		sc.close();
		
		int i = 1;
		int cnt = 1;
		
		while (x > cnt) {
			i++;
			cnt += i; // x가 속한 대각선 찾기, ex) x가 7이라면? 1차시 cnt 3 i 1 2차시 cnt 5 i 2 , cnt 8 i 3, cnt 10 i 4 (x) => x는 i = 3 번 째 위치
		}
		
		int num1 = cnt - i + 1; // 현재 대각선의 시작 위치 ex) num1 = 8 - 3 + 1 => 6
		int count = x - num1; // 입력값 x가 해당 대각선에서 몇 번째에 있는지 계산 ex) 7 - 6 => 1

		int p, q;
		// 짝수 대각선: 분모가 감소하고, 분자가 증가합니다. 
		// 홀수 대각선: 분모가 증가하고, 분자가 감소합니다. ex) i = 3 -> p = 3 - 1 / q = 1 + 1
		if (i % 2 == 0) {
			p = 1 + count;
			q = i - count;
		} else {
			p = i - count;
			q = 1 + count;
		}
		System.out.println(p + "/" + q);
	}
}
