// 백준-곱셈-2588
package java_backjoon;

import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        sc.close();
        
        System.out.println(n1 * (n2 % 10));
        System.out.println(n1 * ((n2-(n2/100)*100)/10));
        System.out.println(n1 * (n2 / 100));
        System.out.println(n1 * n2);
    }
}