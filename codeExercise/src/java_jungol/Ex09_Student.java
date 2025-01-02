// 구조체-자가진단2 #614
package java_jungol;

public class Ex09_Student {
	String school = "Jejuelementary";
	int grade = 6;

	private String varSchool;
	private int varGrade;
	
	public void setStudent(String school, int grade) {
		this.varSchool = school;
		this.varGrade = grade;
	}
	
	public String getSchool() {
		return varSchool;
	}
	
	public int getGrade() {
		return varGrade;
	}
}
