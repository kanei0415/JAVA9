package shape;

// 추상 클래스
// 1. 추상 메소드가 하나라도 있다면 그 클래스는 반드시 추상 클래스가 되어야 한다.
// 2. 추상 메소드가 없어도 추상 클래스는 될 수 있다.
// 3. 추상 클래스는 인스턴스는 만들 수 없다.
// 4. 추상 클래스는 부모클래스로만 사용되어서 다형성을 구현할 목적으로 사용된다.
// 5. 추상 클래스로부터 상속받은 자식클래스에서는 부모 클래스의 추상 메소들 반드시 overriding해야한다.
// 6. 자식 클래스에서 부모 클래스의 추상 메소드를 오버라이딩하지 않으면, 해당 클래스는 추상 클래스가 되어야 한다.

// 도형 class - 부모 class
public abstract class Shape {
	
	// 추상 메소드 - 구현부가 없음. abstract가 붙어 있다.
	public abstract void draw();
	
	public abstract String toString();
	
	public void print() {
		System.out.println(toString());
		draw();
	}
}
