package java_backjoon;

import java.util.Scanner;

public class Ex42 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] arr = new int[N];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		
		int total = 0;
		for (int i = 0; i < N; i++) {
            if (i + 2 < N && arr[i + 1] > arr[i + 2]) {
                int min = Math.min(arr[i], arr[i + 1] - arr[i + 2]);
                total += 5 * min;
                arr[i] -= min;
                arr[i + 1] -= min;
            }
            if (i + 2 < N) {
                int min = Math.min(arr[i], Math.min(arr[i + 1], arr[i + 2]));
                total += 7 * min;
                arr[i] -= min;
                arr[i + 1] -= min;
                arr[i + 2] -= min;
            }
            if (i + 1 < N) {
                int min = Math.min(arr[i], arr[i + 1]);
                total += 5 * min;
                arr[i] -= min;
                arr[i + 1] -= min;
            }
            if (arr[i] > 0) {
                total += 3 * arr[i];
            }
        }
		System.out.println(total);
	}
}
