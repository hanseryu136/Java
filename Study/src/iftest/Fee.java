package iftest;
/**
 * 놀이공원 입장료 계산기
 */
/*
[조건]

기본 입장료는 50,000원입니다.

나이가 65세 이상이면: 50% 할인 (25,000원)

나이가 13세 미만(초등학생 이하)이면: 20,000원 고정

나이가 19세 이하(청소년)이면: 10% 할인 (45,000원)

그 외(성인)는: 기본 입장료 그대로 (50,000원)
*/
import java.util.Scanner;
public class Fee {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("나이를 입력하세요: ");
		
		int age = sc.nextInt();
		int price = 50000;
		System.out.println("나이: " + age);
		
		if(age >= 65) {
			price /= 2;
		}else if(age < 13) {
			price = 20000;
		}else if(age < 19) {
			price = (price * 90) / 100;
		}
		
		System.out.println("최종 요금: " + price + "원");
		
		sc.close();
	}
	
}
