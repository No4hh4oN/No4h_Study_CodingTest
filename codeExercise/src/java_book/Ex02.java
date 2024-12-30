//package java_book;
//
//public class Ex02 {
//	public static void main(String[] args){
//		int var1 = 10;
//		int var2 = 012; //8진수
//		int var3 = 0xA; //16진수
//		
//		System.out.println(var1);
//		System.out.println(var2);
//		System.out.println(var3);
//	}
//
//}
package java_book;

public class Ex02 {
	public static void main(String[] args) {
		byte var1 = 125;
		int var2 = 125;
		for (int i = 0; i < 5; i++) {
			var1++;
			var2++;
			System.out.println("var1 : " + var1 + "\t" + "var2 : " + var2);
		}

	}
}