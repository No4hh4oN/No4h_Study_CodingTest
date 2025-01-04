// 백준-10039-평균 점수
package java_backjoon;

import java.util.Scanner;

public class Ex11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] stuList = new int[5];
		int avg = 0;
		for(int i = 0; i < stuList.length; i++) {
			stuList[i] = sc.nextInt();
			if(stuList[i] < 40) { 
				stuList[i] = 40;
			}
			avg += stuList[i];
		}
		System.out.println(avg/stuList.length);
	}
}