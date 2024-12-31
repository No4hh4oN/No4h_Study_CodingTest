package java_jungol;

public class Ex08_Student {
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
