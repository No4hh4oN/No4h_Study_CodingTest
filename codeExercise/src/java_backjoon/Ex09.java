// 백준-3040-백설공주와 일곱난쟁이
package java_backjoon;

import java.util.Scanner;

public class Ex09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int fakeIndex1 = 0;
		int fakeIndex2 = 0;
		int[] dwarf = new int[9];
		int total = 0;

		for (int i = 0; i < dwarf.length; i++) {
			dwarf[i] = sc.nextInt();
			total += dwarf[i];
		}
		sc.close();
		
		//전체 토탈에서 i번째와 j번째 난쟁이의 수를 뺐을 때, 100이 나오면 해당 i번째 j번째 난쟁이가 가짜다.
		for (int i = 0; i < dwarf.length - 1; i++) {
			for (int j = i+1; j < dwarf.length; j++) {
				if(total - dwarf[i] - dwarf[j] == 100) {
					fakeIndex1 = i;
					fakeIndex2 = j;
					break;
				}
			}
		}
		
		//출력
		for (int i = 0; i < dwarf.length; i++) {
			if (i == fakeIndex1 || i == fakeIndex2)
				continue;
			else {
				System.out.println(dwarf[i]);
			}
		}
	}
}