//백준-10845-큐(util 사용)
package java_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Ex28 {
	public static void main(String[] arsg) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		Queue<Integer> myQueue = new LinkedList<Integer>();

		for (int i = 0; i < N; i++) {
			String[] str = br.readLine().split(" ");

			if (str[0].equals("push")) {
				myQueue.offer(Integer.parseInt(str[1]));
			} else if (str[0].equals("pop")) {
				System.out.println(myQueue.isEmpty() ? -1 : myQueue.poll());
			} else if (str[0].equals("size")) {
				System.out.println(myQueue.size());
			} else if (str[0].equals("empty")) {
				System.out.println(myQueue.isEmpty() ? 1 : 0);
			} else if (str[0].equals("front")) {
				System.out.println(myQueue.isEmpty() ? -1 : myQueue.peek());
			} else if (str[0].equals("back")) {
				System.out.println(myQueue.isEmpty() ? -1 : ((LinkedList<Integer>) myQueue).getLast());
			} else {
				System.out.println("Error");
			}
		}
	}
}
