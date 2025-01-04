// 정올-출력-자가진단8 #508
package java_jungol;

public class Ex14 {
	public static void main(String[] args) {
		String str1[] = {
				"item", "count", "price"
		};
		String str2[] = {
				"pen", "20", "100"
		};
		String str3[] = {
				"note", "5", "95"
		};
		String str4[] = {
				"eraser", "110", "97"
		};
		
		for(int i = 0; i < 3; i++) {
			System.out.printf("%10s", str1[i]);
		}
		System.out.println();
		for(int i = 0; i < 3; i++) {
			System.out.printf("%10s", str2[i]);
		}
		System.out.println();
		for(int i = 0; i < 3; i++) {
			System.out.printf("%10s", str3[i]);
		}
		System.out.println();
		for(int i = 0; i < 3; i++) {
			System.out.printf("%10s", str4[i]);
		}
	}
}