package class1.sub5;

public class Subject {
	private String subName;
	private Student[] students;
	private int studentCount;
	
	public Subject(String subName, Student[] students, int studentCount) {
		this.subName = subName;
		this.students = students;
		this.studentCount = studentCount;
	}
	
	public void addStudent(Student student) {
		
	}
	
	public void printSubjectInfo() {
		System.out.println("과목명: " + this.subName);
		System.out.println("수강생: " + this.students);
	}
	
	public String getSubName() {
		System.out.printf("성적%n - %s:%d%n - %s:%d%n", );
	}
	
	
}
