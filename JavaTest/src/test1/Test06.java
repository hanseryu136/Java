package test1;

import java.util.Scanner;

public class Test06 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("x값 입력 : ");
		int x = sc.nextInt();
		
		System.out.print("y값 입력 : ");
		int y = sc.nextInt();
		
		// 삼항 연산자 (조건) ? (참일 때 값) : (거짓일 때 값)
		String result = (x > y) ? "x가 더 큽니다." : "y가 더 큽니다.";
		
		System.out.println(result);
		
		sc.close();
	}
}
