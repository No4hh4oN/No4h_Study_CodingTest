package java_jungol;

public class Ex05 {
	public static void main(String[] args) {
		int n = 1;
		//while문
		while (n < 16) {
			System.out.print(n + " ");
			n++;
		}
		//for문
		for (int i = 1; i < 16; i++) {
			System.out.print(i + " ");
		}
		//do while문
		int m = 0;
		do {
			m++;
			System.out.print(m + " ");
		} while(m < 15);
	}
}
