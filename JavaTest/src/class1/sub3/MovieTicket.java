package class1.sub3;

public class MovieTicket {
	private String movieTitle;
	private String screenTime;
	private String seatNumber;
	private boolean isBooked;
	
	public MovieTicket(String movieTitle, String screenTime, String seatNumber) {
		this.movieTitle = movieTitle;
		this.screenTime = screenTime;
		this.seatNumber = seatNumber;
		this.isBooked = false;
	}
	
	public void bookTicket() {
		if(!isBooked) {
			this.isBooked = true;
			System.out.printf("%s, %s, %s 예매 완료 \n", movieTitle, screenTime, seatNumber);
		}else {
			System.out.println("이미 예매됨");
		}
	}
	
	public void cancelTicket() {
		if(!isBooked) {
			System.out.println("아직 예매 안 됨");
		}else {
			this.isBooked = false;
			System.out.printf("%s, %s, %s 취소 완료 \n", movieTitle, screenTime, seatNumber);
		}
	}
	
	public void printTicketInfo() {
		String status = isBooked ? "Yes" : "No";
		System.out.println("영화 제목: " + this.movieTitle);
		System.out.println("상영 시간: " + this.screenTime);
		System.out.println("좌석 번호: " + this.seatNumber);
		System.out.println("예매 여부: " + status);
	}
	
}
