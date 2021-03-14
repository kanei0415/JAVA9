
// 자동차 클래스
class Car{
	// member variable
	// instance variable
	private String name;
	private int width;
	private int height;
	private int length;
	private double x;
	private double y;
	private double fuel;
	
	Car(String name, int width, int height, int length, double fuel) {
		this.name = name;
		this.width = width;
		this.height = height;
		this.length = length;
		this.fuel = fuel;
		x = y = 0.0;
	}
	
	// member method
	// instance method
	// getter
	public double getX() {
		return x;
	}
	public double getY() {
		return y;
	}
	public double getFuel() {
		return fuel;
	}
	
	// setter
	public void setX(double x) {
		this.x = x;
	}
	public void setY(double y) {
		this.y = y;
	}
	public void srtFuel(double fuel) {
		this.fuel = fuel;
	}
	
	// 자동차의 제원을 출력하는 프로그램
	public void printInfo() {
		System.out.println("차의 이름은 : " + name);
		System.out.println("차의 너비는 : " + width);
		System.out.println("차의 높이는 : " + height);
		System.out.println("차의 길이는 : " + length);
		System.out.println();
	}
}

public class CarTest01 {
	public static void main(String[] args) {
		// 자동차의 인스턴스 3개 만들어 출력
		Car car1 = new Car("BMW", 150, 100, 150, 50.51);
		Car car2 = new Car("펠리세이드", 200, 200, 300, 100.55);
		Car car3 = new Car("벨로스터", 100, 200, 100, 30.57);
		
		// 자동차의 정보 출력
		car1.printInfo();
		car2.printInfo();
		car3.printInfo();
	}
}

