package class1.sub4;

public class Member {
	private String name;
	private String memberId;
	private Book borrowedBook;
	
	public Member(String name, String memberId) {
		this.name = name;
		this.memberId = memberId;
		this.borrowedBook = null;
	}
	
	// 도서를 대출하고, 회원이 갖는 대출 도서에서 추가
	public void borrowBook(Book book) {
		if() {
			
		}
		this.borrowedBook = book;
		System.out.println(book.getTitle() + " 이미 대출됨");
	}
	
	// 도서를 반납하고, 회원이 갖는 대출 도서에서 제거
	public void returnBook(Book book) {
		this.borrowedBook = null;
		System.out.println("도서 반납: " + book.getTitle());
	}
	
	public void getMemberInfo() {
		System.out.println("회원명: " + this.name);
		System.out.println("ID: " + this.memberId);
		
		if(borrowedBook != null) {
			System.out.println("대출한 도서: " + borrowedBook.getTitle());
		}else {
			System.out.println("대출한 도서: 없음");
		}
	}
}
