package java_book;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Ex000_Lunch {
	public static void main(String[] args) throws IOException, InterruptedException {
		String[] lunchOptions = { "맘스터치", "토리코코로", "몽키파스타", "편의점", "홍원", "주떡", "돈까스", "청와삼대", "세상만사감자탕(뼈해장국)", "꿈떡",
				"중국관", "창부리또", "쌀국수공방", "다람이임자탕(채식)", "최고집해물찜칼국수", "배달", "출구 없는 덮밥" };

		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		System.out.println("스페이스바(Enter 키)를 눌러 멈춰주세요!");

		while (true) {
			int choice = random.nextInt(lunchOptions.length);
			System.out.print("\r오늘의 점심 메뉴: " + lunchOptions[choice]); // 한 줄 업데이트

			Thread.sleep(10); // 100ms 간격

			if (System.in.available() > 0) { // 입력 감지
				scanner.nextLine(); // 입력 대기
				break;
			}
		}

		scanner.close();

		System.out.println("\n결정된 메뉴: " + lunchOptions[random.nextInt(lunchOptions.length)]);
	}
}
