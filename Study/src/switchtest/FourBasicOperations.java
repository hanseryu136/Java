package switchtest;
/**
 * 미니 사칙연산기
 */
/*
[조건]

두 개의 정수를 각각 num1, num2에 입력받습니다.

연산자(String)를 op에 입력받습니다. (예: "+")

switch 문을 사용하여 op의 값에 따라 결과를 출력합니다.

+ : 두 수의 합

- : 두 수의 차

* : 두 수의 곱

/ : 두 수의 몫 (정수 나눗셈)

만약 연산자를 잘못 입력했다면 "잘못된 연산자입니다."를 출력하세요.
 */
import java.util.Scanner;
public class FourBasicOperations {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 숫자 입력: ");
		int num1 = sc.nextInt();
		
		System.out.print("두 번째 숫자 입력: ");
		int num2 = sc.nextInt();
		
		System.out.print("연산자 입력(+, -, *, /): ");
		String op = sc.next();
		
		sc.close();
		
		double result = 0;
		
		switch(op) {
		case "+" :
			result = num1 + num2;
			break;
		case "-" :
			result = num1 - num2;
			break;
		case "*" :
			result = num1 * num2;
			break;
		case "/" :
			if(num2 != 0) {
			result = (double) num1 / num2;
			}else {
				System.out.println("0으로 나눌 수 없습니다.");
				return;
			}
			break;
			
		default:
			System.out.println("잘못된 연산자입니다.");
			return;
		}

		
		System.out.println("결과값: " + result);
		
	}
}
