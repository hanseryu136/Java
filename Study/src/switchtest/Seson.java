package switchtest;
/**
 * 계절 판독기
 */
/*
[조건]

3, 4, 5월: "봄입니다." 출력

6, 7, 8월: "여름입니다." 출력

9, 10, 11월: "가을입니다." 출력

12, 1, 2월: "겨울입니다." 출력

그 외의 숫자: "잘못된 입력입니다." 출력
 */
import java.util.Scanner;
public class Seson {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("몇 월인지 입력하세요 : ");
		int month = sc.nextInt();
		
		System.out.printf("%d월은 ", month);
		
		switch(month) {
		
		case 3 : case 4 : case 5:
			System.out.println("봄입니다.");
			break;
		case 6 : case 7 : case 8:
			System.out.println("여름입니다.");
			break;
		case 9 : case 10 : case 11:
			System.out.println("가을입니다.");
			break;
		case 12 : case 1 : case 2:
			System.out.println("겨울입니다.");
			break;
		default:
			System.out.println("1~12 사이의 숫자만 입력해주세요.");
		}
		
		
		sc.close();
	}
	
}
