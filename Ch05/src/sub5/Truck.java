package sub5;

public class Truck extends Car{

	private int capacity;	// 적재 용량
	private final int MAX_SPEED = 160;
	
	public Truck(String name, String color, int speed, int capacity) {
		super(name, color, speed);
		this.capacity = capacity;
	}

	@Override
	public void speedUp(int speed) {
		// 부모 클래스에 있는 speedUp을 자식 클래스에 맞게 재정의
		this.speed += speed;
		
		if(speed > MAX_SPEED) {
			this.speed = MAX_SPEED;
		}
	}
	
	public void load(int capacity) {
		this.capacity += capacity;
	}
	
	public void show() {
		System.out.println("차량명 : " + name);	// Car의 속성이 private이면 접근 불가 > protected로 변경
		System.out.println("차량색 : " + color);
		System.out.println("적재량 : " + this.capacity);
		System.out.println("현재 속도 : " + speed);
	}
	
	
	
	
}
