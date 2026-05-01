package test1;

import java.util.Scanner;

public class Test04 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수 입력 : ");
		int score = sc.nextInt();
		char grade = 0;
		
		System.out.println("입력한 점수는 " + score + "입니다.");
		
		if(90 <= score && score <= 100) {
			grade = 'A';
		}else if(80 <= score) {
			grade = 'B';
		}else if(70 <= score) {
			grade = 'C';
		}else if(60 <= score) {
			grade = 'D';
		}else {
			grade = 'F';
		}	
		
		System.out.printf("등급은 %c입니다.", grade);
		
		sc.close();
	}
}
