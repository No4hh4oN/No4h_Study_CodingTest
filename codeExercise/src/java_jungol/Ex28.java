// 정올 아님, 주사위의 갯수와 면의 수 -> 주사위 모든 경우의 수
package java_jungol;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex28 {
	static int num1;
	static int num2;
	static int[] result;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] numStr = br.readLine().split(" ");
		num1 = Integer.parseInt(numStr[0]); // 주사위 개수
		num2 = Integer.parseInt(numStr[1]); // 면의 수
		
		result = new int[num1]; // 주사위 개수만큼 배열 초기화

		printDice(0);
	}

	// x는 현재 주사위의 인덱스
    static void printDice(int x) {
    	
        if (x == num1) { // 모든 주사위에 대한 값을 설정한 경우
            for (int i = 0; i < num1; i++) {
                System.out.print(result[i] + " "); // 결과 출력
            }
            System.out.println();
            return;
        }

        // 현재 주사위(x)에 대해 가능한 모든 면의 수 시도
        for (int i = 1; i <= num2; i++) {
            result[x] = i; // 현재 주사위에 면의 수 설정
            printDice(x + 1); // 다음 주사위 설정
        }
    }
}