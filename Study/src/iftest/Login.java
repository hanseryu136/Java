package iftest;
/**
 * 로그인 시스템 시뮬레이션
 */
/*
[설정값]

시스템에 저장된 정답 아이디: "java"

시스템에 저장된 정답 비밀번호: 1234

[조건]

아이디와 비밀번호가 모두 맞으면: "로그인 성공! 환영합니다." 출력

아이디는 맞는데 비밀번호가 틀리면: "비밀번호가 틀렸습니다." 출력

아이디부터 틀리면: "존재하지 않는 아이디입니다." 출력
 */
import java.util.Scanner;
public class Login {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("아이디를 입력하세요: ");
		String inputId = sc.next();
		
		System.out.print("비밀번호를 입력하세요: ");
		int inputPw = sc.nextInt();
		
		String id = "java";
		int pw = 1234;
		
		if(id.equals("java") && inputPw == pw) {
			System.out.println("로그인 성공! 환영합니다.");
		}else if(inputId == id && inputPw != pw) {
			System.out.println("비밀번호가 틀렸습니다.");
		}else if(inputId != id && inputPw != pw) {
			System.out.println("존재하지 않는 아이디입니다.");
		}
		
		
		
		
		sc.close();

	}
	
}
