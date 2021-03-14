//instance variable and instance method는 instance를 만들 때마다 생성되는 variable and method
// class variable and class method는 class에 딱 하나만 만들어져서 모든 instance에서 공유하는 variable and method다.

// static method의 사용
// 1. 인스턴스 메소드에서는 자신의 인스턴스 변수와 자신의 인스턴스 메소드는 물론 공유하는 클래서 변수 클래스 메소드까지 접근가능하다.
// 2. 클래스 메소드에서는 클래스 변수와 클래스 메소드에는 접근이 가능하나 각각의 인스턴스 변수, 인스턴스 메소드에는 접근이 불가하다.
class Static{
	private static int s; // class variable
	private int i; // instance variable
	
	public int getI() {
		return i;
	}
	public static int getS() {
		return s;
	}
	
	public static void sm1() { // static method
		
	}
	public void im1() { // instance method
		
	}
	
	public static void sm2(int x) { // static method
		s = x;
//		i = x; // class method는 instance variable에 접근 불가 -> 어떤 instance의 method인지 판단할 수 없기 때문이다.
		sm1();
//		im1(); // class method에서는 instance method에 접근 불가 -> 어떤 instance의 method인지 판단할 수 없기 때문이다.
	}
	public void im2(int x) { // instance method
		s = x;
		i = x; // instance method는 instance variable에 접근가능 -> 자신의 것에 접근
		sm1();
		im1(); // instance method는  instance method에 접근가능 -> 자신의 것에 접근
	}
}

public class StaticMethodTest01 {
	public static void main(String[] args) {
		Static s1 = new Static();
		Static s2 = new Static();
		Static s3 = new Static();
		
		Static.sm2(10);
		s1.im2(20);
		
		System.out.println("s1의 i = " + s1.getI());
		System.out.println("s2의 i = " + s2.getI());
		System.out.println("s3의 i = " + s3.getI());
		
		System.out.println("static의 s = " + Static.getS());
	}
}
