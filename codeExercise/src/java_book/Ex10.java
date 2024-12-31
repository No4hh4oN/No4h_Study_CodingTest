// Q) 0 ~ 100 사이의 난수 발생
package java_book;

public class Ex10 {
	public static void main(String[] args) {
		int num1 = (int) (Math.random() * 101);
		System.out.println("랜덤 정수 숫자 " + num1 + "이(가) 나왔습니다.");
		
		//실수 난수
		float num2 = (float)(Math.random()*101);
		System.out.printf("랜덤 실수 숫자 %.2f이(가) 나왔습니다.", num2);
	}
}
