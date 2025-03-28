// 백준 - 좌표 정렬하기 (Array sort 활용)
package java_backjoon;

import java.util.Arrays;
import java.util.Scanner;

public class Ex54 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		int[][] arr = new int[N][2];

		for (int i = 0; i < N; i++) {
			for(int j = 0; j < 2; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		Arrays.sort(arr, (o1, o2) -> {
		    // arr[0]이 동일하면 arr[1] 기준으로 비교
		    if (o1[0] == o2[0]) {
		        
		        return o1[1] - o2[1];
		    }
		    return o1[0] - o2[0];
		});
		
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < 2; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
