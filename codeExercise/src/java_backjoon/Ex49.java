package java_backjoon;

import java.util.Scanner;
import java.util.Stack;

public class Ex49 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            String input = sc.nextLine();
            if (input.equals(".")) {
            	break;
            }

            if (Check(input)) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
        sc.close();
    }

    public static boolean Check(String str) {
        Stack<Character> stack = new Stack<>();

        for (char ch : str.toCharArray()) {
            if (ch == '(' || ch == '[') {
                stack.push(ch);
            } else if (ch == ')') {
                if (stack.isEmpty() || stack.pop() != '(') return false;
            } else if (ch == ']') {
                if (stack.isEmpty() || stack.pop() != '[') return false;
            }
        }

        return stack.isEmpty();
    }
}
