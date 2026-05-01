package sub2;

/**
 * 날짜 : 2026/04/29
 * 이름 : 한세류
 * 내용 : Java 캡슐화 실습
 */

public class EncapsuleTest {
	
	public static void main(String[] args) {
	
		// Car 객체 생성
		Car sonata = new Car("소나타", "흰색", 0);	// 생성자 초기화
		
		Car avante = new Car();	// 간접 초기화 - 안전함
		
		// 객체 초기화 -> 캡슐화된 속성을 생성자로 초기화
		//sonata.brand = "소나타";
		//sonata.color = "흰색";
		//sonata.speed = 0;
		
		// 속성값 수정
		//sonata.color = "은색";
		sonata.setColor("은색");	// 안전하게 세터로 수정
		sonata.show();
		
		// 세터 초기화
		avante.setBrand("아반테");
		avante.setColor("검정");
		avante.setSpeed(0);
		
		System.out.println("차량명 : " +avante.getBrand());
		System.out.println("차량색 : " +avante.getColor());
		System.out.println("현재속도 : " +avante.getSpeed());
		
/////////////////////////////////////////////////////////////////////////////
		// Account 객체 생성
		Account kb = new Account();
		Account wr = new Account();

		
		kb.setBank("국민은행");
		kb.setId("110-111-111");
		kb.setName("김유신");
		kb.setBalance(1000);
		
		wr.setBank("우리은행");
		wr.setId("110-121-111");
		wr.setName("이순신");
		wr.setBalance(10000);
		
		kb.show();
		wr.show();
		
		/*System.out.println("은행명 : " + kb.getBank());
		System.out.println("계좌번호 : " + kb.getId());
		System.out.println("임금주 : " + kb.getName());
		System.out.println("현재잔액 : " + kb.getBalance());
		*/
		
////////////////////////////////////////////////////////////////////		
		// Book 객체 생성
		Book jb = new Book();
		
		jb.setTitle("자바");
		jb.setAuthor("홍길동");
		jb.setCopies(3);
		
		jb.show();
		
		/*System.out.println("책 제목 : " + jb.getTitle());
		System.out.println("저자 : " + jb.getAuthor());
		System.out.println("복사본 : " + jb.getCopies());
		*/
		
		
////////////////////////////////////////////////////////////////////		
		// Member 객체 생성
		Member kim = new Member("김유신", 25, false);
		Member lee = new Member("이순신", 33, true);

		kim.setName("김유신");
		kim.setAge(25);
		kim.setisActive(false);
		lee.setName("이순신");
		lee.setAge(33);		
		
		kim.show();
		lee.show();
		
		/*System.out.println("이름 : " + kim.getName());
		System.out.println("나이 : " + kim.getAge());
		System.out.println("회원 여부 : " + kim.isAdult());
		*/
//////////////////////////////////////////////////////////////////////
		// Movie 객체 생성
		Movie titanic = new Movie("타이타닉", "제임스카메론", 10.0, 300);
		titanic.showDetails();
		
		Movie avatar = new Movie("아바타", "제임스카메론", 9.0, 250);
		avatar.showDetails();
		
		
		
		
		
		
	}	
}
