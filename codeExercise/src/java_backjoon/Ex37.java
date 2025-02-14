package java_backjoon;

import java.util.Scanner;

public class Ex37 {
//	화살표를 한 칸 아래로 내린다. (채널 i에서 i+1로)
//	화살표를 위로 한 칸 올린다. (채널 i에서 i-1로)
//	현재 선택한 채널을 한 칸 아래로 내린다. (채널 i와 i+1의 위치를 바꾼다. 화살표는 i+1을 가리키고 있는다)
//	현재 선택한 채널을 위로 한 칸 올린다. (채널 i와 i-1의 위치를 바꾼다. 화살표는 i-1을 가리키고 있다)

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int indexKBS1 = 0;
		int indexKBS2 = 0;

		String[] channels = new String[N];
		for (int i = 0; i < channels.length; i++) {
			channels[i] = sc.next();
			if (channels[i].equals("KBS1"))
				indexKBS1 = i;
			if (channels[i].equals("KBS2"))
				indexKBS2 = i;
		}

		for (int i = 0; i < indexKBS1; i++) {
			System.out.print("1");
		}
		for (int i = indexKBS1; i > 0; i--) {
			 
			System.out.print("4");
		}

		for (int i = 0; i < indexKBS2; i++) {
			System.out.print("1");
		}
		for (int i = indexKBS2; i > 1; i--) {
			System.out.print("4");
		}
		sc.close();

	}
}