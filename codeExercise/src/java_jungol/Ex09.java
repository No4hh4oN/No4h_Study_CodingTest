package java_jungol;

import java.util.Scanner;

public class Ex09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = Function1();
		
		int N = sc.nextInt();
		for(int i = 0; i < N; i++) {
			System.out.println(str);			
		}
	}
		
	public static String Function1() {
		String str = "~!@#$^&*()_+|";
		return str;
	}
}
