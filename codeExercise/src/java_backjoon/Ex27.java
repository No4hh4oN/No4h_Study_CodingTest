// 백준-10828-스택(2. util.Stack 사용) --> 다시 풀 예정
package java_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Ex27 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		Stack<Stackbucks> stackbucks = new Stack<Stackbucks>();

		for (int i = 0; i < N; i++) {
			String str = br.readLine();

			if (str.equals("push")) {
				int num = Integer.parseInt(br.readLine());
				stackbucks.push(new Stackbucks(num));
			} else if (str.equals("pop")) {
				if (stackbucks.size() == 0) {
					System.out.println("-1");
				} else {
					Stackbucks bucks = stackbucks.pop();
					System.out.println(bucks.getValue());
				}

			} else if (str.equals("size")) {
				System.out.println(stackbucks.size());
			} else if (str.equals("empty")) {
				Boolean bucks = stackbucks.empty();
				if (bucks == true) {
					System.out.println("1");
				} else {
					System.out.println("0");
				}
			} else if (str.equals("top")) {
				Stackbucks bucks = stackbucks.lastElement();
				if (stackbucks.size() == 0) {
					System.out.println("-1");
				} else {
					System.out.println(bucks.getValue());
				}

			} else {
				System.out.println("Error");
			}
		}
	}
}

class Stackbucks {
	private int number;

	public Stackbucks(int number) {
		this.number = number;
	}

	public int getValue() {
		// TODO Auto-generated method stub
		return number;
	}
}

//런타임 에러