package animal;

// 추상 클래스 - 부모 클래스
public abstract class Animal {
	private String name;

	public Animal(String name) {
		this.name = name;
	}
	
	// 추상 메소드
	public abstract void bark();
	
	// 추상 메소드
	public abstract String toString();
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void print() {
		System.out.println(toString());
		bark();
	}

}
