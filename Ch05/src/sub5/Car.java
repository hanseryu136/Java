package sub5;

public class Car {
	
	// private에서 protected 접근 권한을 변경해서 자식 클래스가 접근하도록 허용, 외부에서는 접근 불가
	protected String name;	
	protected String color;
	protected int speed;
	
	public Car(String name, String color, int speed) {
		this.name = name;
		this.color = color;
		this.speed = speed;
	}
	
	public void speedUp(int speed) {
		this.speed += speed;
	}
	
	public void speedDown(int speed) {
		this.speed -= speed;
	}
	
	public void show() {
		System.out.println("차량명 : " + this.name);
		System.out.println("차량색 : " + this.color);
		System.out.println("현재 속도 : " + this.speed);
	}
	
}
