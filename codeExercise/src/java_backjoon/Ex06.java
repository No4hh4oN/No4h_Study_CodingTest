// 백준1913- 달팽이
package java_backjoon;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // N은 홀수
		int M = sc.nextInt(); // M은 입력받는 수
		int targetX = 0, targetY = 0; // 입력받는 수의 좌표
		sc.close();
		int[][] arr = new int[N][N]; //전체 배열
		int startNum = N * N;
		int tryNum = 0; //반복 횟수(0부터)
		int sideLength = N - 1; //배열의 가로나 세로 길이(N * N) 에서 1뺀 것을 의미
		while (true) {
			//Down
			for (int i = tryNum; i < sideLength + tryNum; i++) {
				arr[i][tryNum] = startNum--;
			}
			//Right
			for (int j = tryNum; j < sideLength + tryNum; j++) {
				arr[sideLength + tryNum][j] = startNum--;
			}
			//Up
			for (int i = sideLength + tryNum; i > tryNum; i--) {
				arr[i][sideLength + tryNum] = startNum--;
			}
			//Left
			for (int j = sideLength + tryNum; j > tryNum; j--) {
				arr[tryNum][j] = startNum--;
			}
			tryNum++; //반복 횟수에 1을 추가해줌
			sideLength -= 2; //Up, down 각각 1씩 사용했으므로 2 빼줌
			if (sideLength == 0) { //홀수에서 1뺀 값에서 계속 해서 2를 빼주다보면 0이 되는데 그 0이 되는 순간이 1이 들어갈 자리이므로 1을 해당 자리에 넣어줌
				arr[N / 2][N / 2] = 1;
				break;
			}
		}
		
		// 배열 출력 및 숫자 좌표(+1) 찾기
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
