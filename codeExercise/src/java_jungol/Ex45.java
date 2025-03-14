package java_jungol;

import java.util.Scanner;

public class Ex45 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String[] strings = new String[5];
		
		for(int i = 0; i < 5; i++) {
			strings[i] = scanner.nextLine();
		}
		String check1 = scanner.nextLine();
		String check2 = scanner.nextLine();
		boolean check3 = false;
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < strings[i].length(); j++) {
				if(strings[i].charAt(j) == check1.charAt(0)) {
					System.out.println(strings[i]);
					check3 = true;
					break;
				}
				if(strings[i].contains(check2) == true) {
					System.out.println(strings[i]);
					check3 = true;
					break;
				}
			}
		}
		
		if(check3 == false) System.out.println("none");
	}
}