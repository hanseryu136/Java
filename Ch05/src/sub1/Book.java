package sub1;

public class Book {

	String title;
	String author;
	int copies;
	
	public boolean borrowBook(int copies) {
		if(copies > 0) {
			copies--;
			return true;
		}else {
			return false;
		}
	}
	
	public void returnBook(int copies) {
		copies++;
	}
	
	public void show() {
		System.out.println("책 제목 : " + title);
		System.out.println("저자 : " + author);
		System.out.println("복사본 : " + copies);

	}
	
}
