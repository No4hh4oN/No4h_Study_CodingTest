package java_book;

import java.util.Arrays;

public class Ex52 {
	public static void main(String[] args) {
		int[] arr = { 1, 3, 2, 9, 8, 10, 129, 2, 0, -9 };

		Ex52Math math = new Ex52Math();

		int max = math.max(arr);
		int min = math.min(arr);

		System.out.println("최대값 : " + max + "\n" + "최소값 : " + min);
	}
}

class Ex52Math {
	int max(int[] x) {
		int[] arr = x;
		Arrays.sort(arr);
		int M = arr[arr.length - 1];
		return M;
	}

	int min(int[] x) {
		int[] arr = x;
		Arrays.sort(arr);
		int N = arr[0];
		return N;
	}
}