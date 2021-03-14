package animal;

// 강아지 클래스 - 자식클래스
public class Dog extends Animal {
	
	private String type; // 견종
	
	public Dog(String name, String type) {
		super(name);
		this.type = type;
	}
	
	@Override
	public void bark() {
		System.out.println("멍멍!");
	}
	
	@Override
	public String toString() {
		return "제 이름은 " + getName() +"입니다." + "견종은 " + type + "입니다.";
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public String getType() {
		return type;
	}
}
