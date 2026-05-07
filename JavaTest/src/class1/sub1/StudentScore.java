package class1.sub1;

public class StudentScore {

	protected String studentName;
	protected String studentId;
	protected String subject;
	protected double score;
	
	public StudentScore(String studentName, String studentId, String subject, double score) {
		this.studentName = studentName;
		this.studentId = studentId;
		this.subject = subject;
		this.score = score;
	}
	
	public void updateScore(double newScore) {
		if (newScore >= 0 && newScore <= 100) {
			this.score = newScore;
			System.out.println("점수 수정 완료");
		}else {
			System.out.println("잘못된 점수 입력");
		}
	}
	
	public double getScore() {
		return this.score;
	}
	
	public void printStudentInfo() {
		System.out.println("이름: " + studentName);
		System.out.println("id: " + studentId);
		System.out.println("과목명: " + subject);
		System.out.println("점수: " + score);
		
	}
	
}
