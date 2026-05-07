package class1.sub4;

public class Book {
		private String title;
		private String author;
		private String isbn; // 도서 번호
		private boolean isBorrowed; // 도서 대출 여부
		
		public Book(String title, String author, String isbn) {
			this.title = title;
			this.author = author;
			this.isbn = isbn;
			this.isBorrowed = false;
		}
		
		// 도서가 대출되지 않은 상태라면 대출
		public void borrowBook() {
			if(isBorrowed) {
				System.out.println("도서대출: " + this.title);
				this.isBorrowed = true;
			}
		}
		
		// 도서가 대출된 상태라면 반납
		public void returnBook() {
			if(!isBorrowed) {
				System.out.println("도서반납: " + this.title);
				this.isBorrowed = false;
			}
		}
		
		public void getBookInfo() {
			System.out.println("도서명: " + this.title);
			System.out.println("저자: " + this.author);
			System.out.println("ISBN: " + this.isbn);
			System.out.println("대출 여부: " + (this.isBorrowed ? "가능" : "불가능"));
		}
		
		// 속성 title의 Getter
		public String getTitle() {
			return this.title;
		}

		
}

