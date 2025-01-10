package java_book;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Ex66 {
	public static void main(String[] args) {
		Map<Student2, Integer> map = new HashMap<Student2, Integer>();
		
		map.put(new Student2(1, "홍길동"), 95);
		map.put(new Student2(2, "홍길동"), 95);
		System.out.println("총 Enty 수 : "+map.size());
	}
}

class Student2 {
	private int sno;
	private String name;
	
	public Student2(int sno, String name) {
		this.sno = sno;
		this.name = name;
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof Student2) {
			Student2 student = (Student2) obj;
			return (sno == student.sno) && (name.equals(student.name));
		} else {
			return false;
		}
	}
	
	public int hashCode() {
		return sno + name.hashCode();
	}
}