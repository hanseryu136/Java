package test1;

public class Test03 {
	public static void main(String[] args) {
		
		int result = 0;
		int num = 1;
		
		result = num++;	// num값을 result에 넣고 ++ 실행
		System.out.println("result : " + result);

		result = ++num;	// ++가 앞에 있어서 ++num이 먼저 실행
		System.out.println("result : " + result);
		
		result = num--;
		System.out.println("result : " + result);
		
		result = --num;
		System.out.println("result : " + result);
	}
}
