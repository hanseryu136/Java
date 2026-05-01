package forTest;
/**
 * 구구단 출력하기
 */
/*
문제]

사용자로부터 출력할 단(2~9)을 입력받습니다.

for문을 사용하여 해당 단의 1부터 9까지 곱셈 결과를 출력하세요.

출력 형식: 5 * 1 = 5 (이런 식으로 한 줄씩!)
 */
import java.util.Scanner;
public class Gugudan {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("출력할 단을 입력하세요: ");
		int dan = sc.nextInt();
		
		System.out.println(dan + "단");
		
		for(int i=1 ; i<=9 ; i++) {
			System.out.printf("%d X %d = %d\n", dan, i, dan * i);
		}
		
		sc.close();
	}
}
