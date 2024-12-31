// 정올-배열1-자가진단4 #558
package java_jungol;

import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[100];
		int i = 0;
		while(true) {
			arr[i] = sc.nextInt();
			if(arr[i] == 0)
				break;
			i++;
		}
		for(int j = i-1; j >= 0; j--) {
			System.out.print(arr[j] + " ");
		}
	}
}
