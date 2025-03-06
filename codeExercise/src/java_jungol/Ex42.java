package java_jungol;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ex42 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		ArrayList<Integer> arrayList = new ArrayList<Integer>();

		for (int i = 0; i < 10; i++) {
			arrayList.add(sc.nextInt());
		}
		Collections.sort(arrayList, Collections.reverseOrder());

		for (int i = 0; i < 10; i++) {
			System.out.print(arrayList.get(i) + " ");
		}
		
		sc.close();
	}
}
