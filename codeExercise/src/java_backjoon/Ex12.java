// 백준-8958-OX퀴즈
package java_backjoon;

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < N; i++) {
            String result = sc.nextLine();
            int total = 0;
            int feverScore = 0;

            for (int j = 0; j < result.length(); j++) {
                if (result.charAt(j) == 'O') {
                    total += 1 + feverScore;
                    feverScore++;
                } else if (result.charAt(j) == 'X') {
                    feverScore = 0;
                }
            }

            System.out.println(total);
        }

        sc.close();
    }
}
