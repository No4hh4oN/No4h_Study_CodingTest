package java_backjoon;

import java.util.Scanner;

public class Ex45 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[][] hLine = new int[N][];
        int[] count = new int[N];

        for (int i = 0; i < N; i++) {
            int row = sc.nextInt();
            hLine[i] = new int[20];
            for (int j = 0; j < 20; j++) {
                hLine[i][j] = sc.nextInt();
            }
        }
        sc.close();
        
        for (int i = 0; i < N; i++) {
            int cCount = 0;
            for (int j = 0; j < 19; j++) {
                for (int k = 0; k < 19 - j; k++) {
                    if (hLine[i][k] > hLine[i][k + 1]) {
                        int temp = hLine[i][k];
                        hLine[i][k] = hLine[i][k + 1];
                        hLine[i][k + 1] = temp;
                        cCount++;
                    }
                }
            }
            count[i] = cCount;
        }
		
		for(int i = 0; i < N; i++) {
			System.out.println(i+1 + " " + count[i]);
		}
	}
}