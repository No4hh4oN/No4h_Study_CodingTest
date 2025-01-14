package java_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.NavigableSet;
import java.util.TreeSet;

public class Ex34 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		TreeSet<Integer> nums = new TreeSet<Integer>();
		int N = Integer.parseInt(br.readLine());
		for(int i = 0; i < N; i++) {
			nums.add(Integer.parseInt(br.readLine()));
		}
		
		NavigableSet<Integer> descendingSet = nums.descendingSet();
		for(Integer num : descendingSet) {
			System.out.println(descendingSet + "");
		}
	}
}