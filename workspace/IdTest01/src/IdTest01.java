
// member variable
// 1. 인스턴스 변수 - static이 없는 변수, 인스턴스를 생성할 때마다 만들어지는 변수
// - instance variable, non-static field, 비정적 필드

// 2. 클래스 변수 - static이 있는 변수, 최초로 class가 사용되는 시점에 딱 한 번만 생성되어 모든 instance에서 공유하는 변수
// - class variable, static field, 정적 필드
// - 클래스 변수를 사용하는 방법 className.variableName 단) private static data-type이면 사용불가

// member method
// 1. 인스턴스 메소드 - static이 없는 메소드, 인스턴스를 생성할 때마다 만들어지는 변수
// - instance method, non-static method, 비정적 메소드

// 2. 클래스 메소드 - static이 있는 메소드, 최초로 class가 사용되는 시점에 딱 한번만 생성되어 모든 instance에서 공유하는 method
// - class method, static method, 정적 메소드
// - 클래스 메소드를 사용하는 방법은 className.methodName

class Id {
	// class 변수, 정적필드
	private static int counter = 0;
	
	// instance 변수, 비정적필드
	private int id;
	
	// 기본생성자
	public Id(){
		this.id = ++counter;
	}
	
	// 클래스 method, 정적 method
	public static int getCounter() {
		return counter;
	}
	
	
	// 인스턴스 method, 비정적 method
	public void setId(int id) {
		this.id = id;
	}
	public int getId() {
		return id;
	}
	public String toString() {
		return String.format("No : %d", id);
	}
}

public class IdTest01 {
	public static void main(String[] args) {
		Id a = new Id();
		Id b = new Id();
		Id c = new Id();
		
		System.out.println(a.toString());
		System.out.println(b.toString());
		System.out.println(c.toString());
		
		// 틀리지는 않았지만 권장하지 않는다.
//		System.out.println("지금까지 생성된 id값 : " + a.getCounter());
		
		// class method는 (해당클래스이름.method명) 으로 사용하는 것을 권장한다.
		System.out.println("지금까지 생성된 id값 : " + Id.getCounter());
	}
}
