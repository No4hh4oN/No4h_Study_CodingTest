// 향상된 for 문 
package java_book;

public class Ex11 {
	public static void main(String[] args) {
		int[] scores = { 9, 7, 8, 9, 8 };
		int sum = 0;
		for (int s : scores) {
			sum += s;
		}

		System.out.println("sum : " + sum);
	}
}
