package sub2;

/**
 * 날짜 : 2026/04/28
 * 이름 : 한세류
 * 내용 : Java 메서드 실습
 */

public class MethodTest {

	// main 메서드 : Java 프로그램 시작 함수
	public static void main(String[] args) {
		
		// 메서드 호출(Call)
		int y1 = f(1);	// f 메서드 호출하면서 매개변수 x의 인자값 1 전달
		int y2 = f(2);
		int y3 = f(3);
		
		System.out.println("y1 : " + y1);
		System.out.println("y2 : " + y2);
		System.out.println("y3 : " + y3);
		
		hello("한세류");
		hello("세류");
		
	}	// main end
	
	// 메서드 정의(Define)
	public static int f(int x) {	// int - 반환타입, f - 메서드명, int x - 매개변수
		int y = 2 * x + 3;
		return y;
	}
	
	public static void hello(String name) {
		System.out.println(name + "님 반갑습니다.");
	}
	
	
}
