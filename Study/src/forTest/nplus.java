package forTest;
/**
 * 1부터 n까지의 합 계산기
 */
/*
[조건]

Scanner를 사용하여 정수 n을 입력받습니다.

for문을 사용하여 1부터 n까지 반복하며 합계를 누적합니다.

최종 합계를 "1부터 n까지의 합: 00" 형식으로 출력합니다.
 */
import java.util.Scanner;
public class nplus {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요: ");
		int n = sc.nextInt();
		
		int sum = 0;
		
		for(int i=1 ; i<=n ; i++) {
			sum += i;
		}
		
		System.out.printf("1부터 %d까지의 합: %d", n, sum);
		
		sc.close();
		
	}
	
}
