package java_jungol;

import java.util.Scanner;

public class Ex40 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String[] strings= new String[10];
		for(int i = 0; i < 10; i++) {
			strings[i] = scanner.nextLine();
		}
		
		String s = scanner.next();
		char c = s.charAt(0);
		
		for(int i = 0; i < 10; i++) {
			if(strings[i].charAt(strings[i].length()-1) == c) {
				System.out.println(strings[i]);
			}
		}
	}
}
