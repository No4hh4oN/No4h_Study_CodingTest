package java_book;

public class Ex46 {
	public static void main(String[] args) {
		String str1 = "Java Programming!";

		System.out.println(str1);
		System.out.println(str1.toLowerCase());
		System.out.println(str1.toUpperCase());

		String tel1 = " 02";
		String tel2 = "    123 ";
		String tel3 = "   4567       ";

		System.out.println(tel1 + tel2 + tel3);
		System.out.println(tel1.trim() + tel2.trim() + tel3.trim());
		System.out.println("------------------------------");
		
		int i = 19;
		double d = 10.8;
		boolean b = true;
		
		String str2 = String.valueOf(i);
		String str3 = String.valueOf(d);
		String str4 = String.valueOf(b);
		
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
	}
}
