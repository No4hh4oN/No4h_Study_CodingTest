// 정올-1840-치즈
package java_jungol;

import java.util.Scanner;

public class Ex27 {
	static Scanner sc = new Scanner(System.in);
	static int p = sc.nextInt();
	static int q = sc.nextInt();
	static int[][] cheese = new int[p][q];
	static int pastCheeseAmount = 0;
	static int nowCheeseAmount = 0;

	public static void main(String[] arsg) {
		

		for (int i = 0; i < cheese.length; i++) {
			for (int j = 0; j < cheese[i].length; j++) {
				cheese[i][j] = sc.nextInt();
			}
		}
		sc.close();

//		출력 검토
//		for(int i = 0; i < cheese.length; i++) {
//			for(int j = 0; j < cheese[i].length; j++) {
//				System.out.print(cheese[i][j] + " ");
//			}
//			System.out.println();
//		}

//		치즈가 공기에 닿았는지 체크 체크
		for (int i = 1; i < cheese.length; i++) {
			for (int j = 1; j < cheese[i].length; j++) {
				airCheck(i, j);
			}
		}
		
		// 출력 검토
		for(int i = 0; i < cheese.length; i++) {
			for(int j = 0; j < cheese[i].length; j++) {
				System.out.print(cheese[i][j] + " ");
			}
			System.out.println();
		}
		
	}

	// 함수로 i -1 이 0인지 j -1이 0 인지 체크 만약 그렇다면 0으로 변경
	// 근데 i+1 한 값의 j-1, j+1한 것도 같이 검증 -> 얘가 1 나오면 둘러쌓인 것임 그러면 얘는 2로 변경해주고
	// 만약 그게 면 이때 2를 1로 바꿔줄 것
	static void airCheck(int i, int j) {
		if (cheese[i][j] == 0) {
			return;
		} else if (cheese[i][j] == 1) {
			if(cheese[i+1][j] == 0) {
				
			}
			else if(cheese[i-1][j] == 1) {
			}
			else if(cheese[i][j+1] == 1) {
			}
			else if(cheese[i][j-1] == 1) {
			}
		}
	}
}
