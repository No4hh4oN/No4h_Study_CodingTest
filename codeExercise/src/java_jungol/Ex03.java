//수업자료코드
package java_jungol;

public class Ex03 {
	public static void main(String[] args) {
		byte var1 = -128;
		byte var2 = -30;
		byte var3 = 0;
		byte var4 = 30;
		byte var5 = 127;
		//byte var6 = 128; 바이트로 표현 불가한 정수, 값의 손실이 발생
		byte var6 = (byte)128; //명시적 형변환
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
		System.out.println(var4);
		System.out.println(var5);
		System.out.println(var6);
	}
}