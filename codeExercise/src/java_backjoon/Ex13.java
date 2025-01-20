// 백준-1149-RGB거리
//package java_backjoon;
//
//import java.util.Scanner;
//
//public class Ex13 {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int N = sc.nextInt();
//		int[][] arr = new int[N][3];
//		int lastIndex = -1;
//		int total = 0;
//
//		for (int i = 0; i < N; i++) {
//			for (int j = 0; j < 3; j++) {
//				arr[i][j] = sc.nextInt();
//			}
//		}
//
//		int j;
//		int outlastIndex = -1;
//		
//		for (int i = 0; i < N; i++) {
//			int temp = 1001;
//			for (j = 0; j < 3; j++) {
//				if (temp > arr[i][j] && outlastIndex != j) {
//					temp = arr[i][j];
//					lastIndex = j;
//				}
//			}
//			outlastIndex = lastIndex;
//			System.out.println(outlastIndex);
//			System.out.println(arr[i][outlastIndex]);
//			total += arr[i][outlastIndex];
//		}
//		System.out.println(total);
//		sc.close();
//	}
//}

//정답 풀이
package java_backjoon;

import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] cost = new int[N][3];
        int[][] dp = new int[N][3];
        
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < 3; j++) {
                cost[i][j] = sc.nextInt();
            }
        }

        // DP 초기화
        dp[0][0] = cost[0][0];
        dp[0][1] = cost[0][1];
        dp[0][2] = cost[0][2];

        // DP 테이블 채우기(피보나치의 형태, 이전 값으로 DP 초기화한 후 현재 가르키는 코스트와 같은 인덱스가 아닌 것 중 최솟값과 더해서 DP에 저장 <- 반복)
        for (int i = 1; i < N; i++) {
            dp[i][0] = cost[i][0] + Math.min(dp[i - 1][1], dp[i - 1][2]);
            dp[i][1] = cost[i][1] + Math.min(dp[i - 1][0], dp[i - 1][2]);
            dp[i][2] = cost[i][2] + Math.min(dp[i - 1][0], dp[i - 1][1]);
        }

        // 최소 비용 계산
        int result = Math.min(dp[N - 1][0], Math.min(dp[N - 1][1], dp[N - 1][2]));

        System.out.println(result);
        sc.close();
    }
}