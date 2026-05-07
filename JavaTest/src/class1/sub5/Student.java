package class1.sub5;

public class Student {
	private String name;
	private String studentId;
	private Subject[] subjects;
	private int[] scores;
	private int subjectCount;
	
	public Student(String name, String studentId, Subject[] subjects, int[] scores, int subjectCount) {
		this.name = name;
		this.studentId = studentId;
		this.subjects = subjects;
		this.scores = scores;
		this.subjectCount = subjectCount;
	}
	
	public void enrollSubject(Subject) {
		
	}
	
	public void setScore(Subject, int) {
		
	}
	
	public void printStudentInfo() {
		System.out.println("학생명: " + this.name);
		System.out.println("아이디: " + this.studentId);
	}
	
	public String getName() {
		
	}
	
}
