package java_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex44 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 상근 SK, 창영 CY
		int N = Integer.parseInt(br.readLine()); // 돌개수

		boolean turn = true;

		while (N > 0) {
			if (turn) {
				if (N - 3 == 0 || N - 1 == 0) {
					break;
				} else {
					if(N - 3 > 3) {
						N -= 3;
					}
					else if(N - 1 > 3) {
						N -= 1;
					}
					else if(N - 3 > 0){
						N -= 3;
					}
					else if(N - 1 > 0 && N <= 2) {
						N -= 1;
					}
					turn = false;
				}
			} else {
				if (N - 3 == 0 || N - 1 == 0) {
					break;
				} else {
					if(N - 3 > 3) {
						N -= 3;
					}
					else if(N - 1 > 3) {
						N -= 1;
					}
					else if(N - 3 > 0){
						N -= 3;
					}
					else if(N - 1 > 0 && N <= 2) {
						N -= 1;
					}
					turn = true;
				}
			}
		}
		
		if(turn) {
			System.out.println("SK");
		} else {
			System.out.println("CY");
		}
	}
}