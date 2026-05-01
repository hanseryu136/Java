package sub2;

public class Movie {

	private String title; // 영화 제목
	private String director; // 감독 이름
	private double rating; // 영화 평점(0.0 ~ 10.0 사이의 값)
	private int availableSeats; // 예약 가능한 좌석 수
	
	public Movie() {}
	
	public Movie(String title, String director, double rating, int availableSeats) {
		this.title = title;
		this.director = director;
		this.rating = rating;
		this.availableSeats = availableSeats;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	public int getAvailableSeats() {
		return availableSeats;
	}
	public void setAvailableSeats(int availableSeats) {
		this.availableSeats = availableSeats;
	}
	
	
	public boolean reserveSeat() {
		if(availableSeats > 0) {
			availableSeats--;
			return true;
		}else {
			return false;
		}
	}
	
	
	public void cancelReservation() {
		availableSeats++;
	}
	
	public void showDetails() {
		System.out.println("제목: " + this.title);
		System.out.println("감독: " + this.director);
		System.out.println("평점: " + this.rating);
		System.out.println("좌석수: " + this.availableSeats);
	}
	
}
