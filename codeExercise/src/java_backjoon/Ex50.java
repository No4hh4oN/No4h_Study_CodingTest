package java_backjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;

public class Ex50 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String[] N = br.readLine().split(" ");
		int N1 = Integer.parseInt(N[0]);
		int N2 = Integer.parseInt(N[1]);

		String[] arr1 = br.readLine().split(" ");
		String[] arr2 = br.readLine().split(" ");

		ArrayList<Integer> set = new ArrayList<Integer>();

		for (int i = 0; i < N1; i++) {
			set.add(Integer.parseInt(arr1[i]));
		}
		for (int i = 0; i < N2; i++) {
			set.add(Integer.parseInt(arr2[i]));
		}

		Integer[] resultArray = set.toArray(new Integer[0]);

		Arrays.sort(resultArray);
		for (int num : resultArray) {
			bw.write(num + " ");
		}

		bw.flush();
		bw.close();
		br.close();
	}
}
