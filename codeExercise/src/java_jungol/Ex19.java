//정올-문자열1-자가진단4 #596
package java_jungol;

import java.util.Scanner;

public class Ex19 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int N = sc.nextInt();
		
		if(N > str.length())
			N = str.length();
		
		for(int i = str.length()-1; i >= str.length()-N; i--) {
			System.out.print(str.charAt(i));
		}
		
	}
}
