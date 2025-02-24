package java_backjoon;

import java.util.Scanner;

public class Ex41 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N1 = sc.nextInt();
		int M1 = sc.nextInt();

		int[][] arr1 = new int[N1][M1];

		for (int i = 0; i < N1; i++) {
			for (int j = 0; j < M1; j++) {
				arr1[i][j] = sc.nextInt();
			}
		}

		int N2 = sc.nextInt();
		int M2 = sc.nextInt();

		int[][] arr2 = new int[N2][M2];

		for (int i = 0; i < N2; i++) {
			for (int j = 0; j < M2; j++) {
				arr2[i][j] = sc.nextInt();
			}
		}
		sc.close();

		int[][] arr3 = new int[N1][M2];
		
		for (int i = 0; i < N1; i++) {
            for (int j = 0; j < M2; j++) {
                for (int k = 0; k < M1; k++) {
                    arr3[i][j] += arr1[i][k] * arr2[k][j];
                    
//ex.                 arr1 			arr2
//                    1 2			-1 -2 0        
//                    3 4			0 0 3
//                    5 6
//                    
//                    	k증가 후 곱셈,2번째 배열의 가로 인덱스 j 증가 후 다시 안쪽 곱셈 후 k 증가, arr2의 가로 M2만큼 와서 연산후 arr1의 세로 인덱스 증가 후 이를 반복
                }
            }
        }
		
		for(int i = 0 ; i < N1; i++) {
			for(int j = 0; j < M2; j++) {
				System.out.print(arr3[i][j] + " ");
			}
			System.out.println();
		}
	}
}
