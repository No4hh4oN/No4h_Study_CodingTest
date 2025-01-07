package java_book;

public class Ex44 {
	public static void main(String[] args) {
		String ssn = "123456-1234567";
		
		int length = ssn.length();
		System.out.println("length : "+length);
		
		if(length == 14)
			System.out.println("주민등록번호가 맞습니다.");
		else {
			System.out.println("주민등록번호가 아닙니다.");
		}
	}
}
