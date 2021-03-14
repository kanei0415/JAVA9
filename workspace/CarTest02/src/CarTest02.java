import java.util.Scanner;

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
	
	// 차의 이동 method
	public boolean move(double dx, double dy) {
		double dist = Math.sqrt(dx * dx + dy * dy); // 거리 구하는 공식
		
		if(fuel > dist) { // 이동가능
			x =+ dx;
			y += dy;
			fuel -= dist;
			return true;
		} else { // 이동불가
			return false;
		}
	}
}

public class CarTest02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("자동자의 제원을 입력하시오 : ");
		System.out.println("이름 : ");
		String name = sc.next();
		System.out.print("너비 : ");
		int width = sc.nextInt();
		System.out.print("높비 : ");
		int height = sc.nextInt();
		System.out.print("길이 : ");
		int length = sc.nextInt();
		System.out.print("연료 : ");
		double fuel = sc.nextDouble();
		
		Car car = new Car(name, width, height, length, fuel);
		
		// 현재위치 받기
		System.out.print("x 축 위치를 입력하세요 : ");
		double x = sc.nextDouble();
		System.out.print("y 축 위치를 입력하세요 : ");
		double y = sc.nextDouble();
		car.setX(x);
		car.setY(y);
		
		// 자동차 움직이기
		while(true) {
			System.out.println("현재의 위치 : (" + car.getX() + ", " + car.getY() + ")");
			System.out.println("남은 연료량 : " + car.getFuel());
			System.out.println();
			
			System.out.println("이동하시겠습니까? (YES : 1/ NO : 0)");
			int indicator = sc.nextInt();
			if(indicator == 0) break;
			System.out.println();
			
			System.out.print("dx를 입력하세요 : ");
			double dx = sc.nextDouble();
			System.out.print("dy를 입력하세요 : ");
			double dy = sc.nextDouble();
			
			if(!car.move(dx, dy)) {
				System.out.println("연료가 부족합니다!");
				System.out.println();
				
				System.out.println("현재의 위치 : (" + car.getX() + ", " + car.getY() + ")");
				System.out.println("남은 연료량 : " + car.getFuel());
				System.out.println();
				
				System.out.println("이동하시겠습니까? (YES : 1/ NO : 0)");
				indicator = sc.nextInt();
				if(indicator == 0) break;
				System.out.println();
			}
			System.out.println("자동차가 멈췄습니다!");

		}
		
		sc.close();
	}
}
