// 정올-구조체-자가진단3 #615
package java_jungol;

import java.util.Scanner;

// 문제 원본 풀이
//public class Ex12 {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		StuInfo stu[] = new StuInfo[2];
//		for(int i = 0; i < 2; i++) {
//				stu[i] = new StuInfo(sc.next(), sc.nextInt(), sc.nextInt());
//		}
//		sc.close();
//		
//		for(int i = 0; i < 2; i++) {
//			System.out.println(stu[i].name + " " + stu[i].korScore + " " + stu[i].engScore);
//		}
//		
//		int avgKor = (stu[0].korScore + stu[1].korScore)/2;
//		int avgEng = (stu[0].engScore + stu[1].engScore)/2;
//		System.out.println("avg " + avgKor + " " + avgEng);
//		
//	}
//
//}
//
//class StuInfo {
//	double avgK, avgE;
//	public String name;
//	public int korScore;
//	public int engScore;
//	
//	public StuInfo(String name, int korScore, int engScore) {
//		this.name = name;
//		this.korScore = korScore;
//		this.engScore = engScore;
//	}
//}

//변경된 요구사항 풀이
public class Ex12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int avgKor = 0;
		int avgEng = 0;
		StuInfo stu[] = new StuInfo[N];
		for (int i = 0; i < stu.length; i++) {
			stu[i] = new StuInfo(sc.next(), sc.nextInt(), sc.nextInt());
		}
		sc.close();

		for (int i = 0; i < stu.length; i++) {
			System.out.println(stu[i].name + " " + stu[i].korScore + " " + stu[i].engScore);
		}

		for (int i = 0; i < stu.length; i++) {
			avgKor += stu[i].korScore;
			avgEng += stu[i].engScore;
		}
		System.out.println("avg " + avgKor / N + " " + avgEng / N);

	}

}

class StuInfo {
	double avgK, avgE;
	public String name;
	public int korScore;
	public int engScore;

	public StuInfo(String name, int korScore, int engScore) {
		this.name = name;
		this.korScore = korScore;
		this.engScore = engScore;
	}
}