package java_backjoon;

import java.util.Scanner;

public class Ex53 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();
        
        
        int minLength = findPalindromeLength(str);
        System.out.println(minLength);
    }

    public static int findPalindromeLength(String str) {
        int len = str.length();

        for (int i = 0; i < len; i++) {
        	//substring은 문자열은 i번쨰부터 잘라서 문자열을 새로 받는거임, 그걸 이용해서 이미 팰린드롬인게 있나 체크
            if (isPalindrome(str.substring(i))) {
                return len + i; // 추가할 문자 개수는 i
            }
        }
        return len * 2 - 1; // 최악? 전체를 뒤집어 추가해야 함
    }

    public static boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
