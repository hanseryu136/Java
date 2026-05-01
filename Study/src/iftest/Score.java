package iftest;
/**
 * 성적 학점 계산기
 */
/*
[조건]

점수는 0점에서 100점 사이입니다.

90점 이상: "A 학점" 출력 + (만약 100점이라면 "축하합니다! 만점입니다." 추가 출력)

80점 이상 90점 미만: "B 학점" 출력

70점 이상 80점 미만: "C 학점" 출력

70점 미만: "F 학점" 출력 + "재수강 대상입니다." 추가 출력
 */
import java.util.Scanner;

public class Score {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수를 입력하세요: ");
		
		int score = sc.nextInt();
		
		if(score >= 90) {
			System.out.println("A 학점");
		}if(score == 100) {
			System.out.println("축하합니다! 만점입니다.");
		}else if(80 <= score && score < 90) {
			System.out.println("B 학점");
		}else if(70 <= score && score < 80) {
			System.out.println("C 학점");
		}else if(score < 70) {
			System.out.println("F 학점");
			System.out.println("재수강 대상입니다.");
		}
		
		sc.close();
	}
		
}
