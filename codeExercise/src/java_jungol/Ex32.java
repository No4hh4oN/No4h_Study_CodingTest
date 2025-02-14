package java_jungol;

import java.util.Scanner;

public class Ex32 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		char[][] c = new char[n][n];
		sc.close();
		
		char ch = 'A';
		for(int i = n-1; i >= 0; i--) {
			
			for(int j = n-1; j >= 0; j--) {
				c[j][i] = ch;
				
				if(ch=='Z') {
					ch = 'A';
					continue;
				}
				ch++;
			}
			
		}
		
		for(int i = 0 ; i < n; i++) {
			for(int j = 0 ; j < n; j++) {
				System.out.print(c[i][j] + " ");
			}
			System.out.println();
		}
	}
}