package java_jungol;

import java.util.Scanner;

public class Ex43 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		Character[][] arr = new Character[N][N];

		Character character = 'A';
		boolean direction = true;
		
		sc.close();
		
		for (int i = 0; i < N; i++) {
			if (direction) {
				for (int j = 0; j < N; j++) {

					if (character == 'Z') {
						arr[j][i] = character;
						character = 'A';
					} else {
						arr[j][i] = character++;
					}
				}
				direction = false;
			} else {
				for (int j = N-1; j >= 0; j--) {

					if (character == 'Z') {
						arr[j][i] = character;
						character = 'A';
					} else {
						arr[j][i] = character++;
					}
				}
				direction = true;
			}
		}
		
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				System.out.print(arr[i][j] +" ");
			}
			System.out.println();
		}
	}
}
