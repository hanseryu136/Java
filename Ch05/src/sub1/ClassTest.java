package sub1;

/**
 * 날짜 : 2026/04/29
 * 이름 : 한세류
 * 내용 : Java 클래스 실습
 */

public class ClassTest {
		
	public static void main(String[] args) {
		
		// 객체 생성
		Car sonata = new Car();
		
		// 객체 초기화
		sonata.brand = "소나타";
		sonata.color = "흰색";
		sonata.speed = 0;
		
		// 객체 활용
		sonata.speedUp(80);
		sonata.speedDown(20);
		sonata.show();
		
		// 생성, 초기화, 활용
		Car avante = new Car();
		
		avante.brand = "아반테";
		avante.color = "검정";
		avante.speed = 0;
		
		avante.speedUp(60);
		avante.speedDown(10);
		avante.show();
		
		// Account 객체 생성 및 초기화
		Account kb = new Account();
		kb.bank = "국민은행";
		kb.id = "110-11-1234";
		kb.name = "김유신";
		kb.balance = 1000;
		
		kb.deposit(20000);
		kb.withdraw(5000);
		kb.show();
		
		Account wr = new Account();
		wr.bank = "우리은행";
		wr.id = "101-22-1001";
		wr.name = "김춘추";
		wr.balance = 5000;
		
		wr.deposit(20000);
		wr.withdraw(10000);
		wr.show();
		
		// Book 객체 생성 및 초기화
		Book jb = new Book();
		jb.title = "자바";
		jb.author = "홍길동";
		jb.copies = 3;
		
		boolean result = jb.borrowBook(0);
		
		if(result) {
			System.out.println("대출 성공!");
			jb.show();
		}else {
			System.out.println("대출 실패!");
			jb.returnBook(2);
			jb.show();
		}
		
		// Member 객체 생성 및 초기화
		Member kim = new Member();
		kim.name = "김유신";
		kim.age = 24;
		kim.isActive = false;
		
		kim.activate();
		
		boolean isAdult = kim.isAdult();
		
		if(isAdult) {
			kim.show();
			System.out.println("성인입니다.");
		}else {
			kim.show();
			System.out.println("미성년자입니다.");
		}
		
		
		
		
		
	}
}








