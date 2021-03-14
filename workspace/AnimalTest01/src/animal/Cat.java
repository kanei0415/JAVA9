package animal;

public class Cat extends Animal {
	
	private int age;
	
	public Cat(String name, int age) {
		super(name);
		this.age = age;
	}
	
	@Override
	public void bark() {
		System.out.println("야옹~");
	}
	
	@Override
	public String toString() {
		return "제 이름은 "  + getName() + "이고, 나이는 " + age + "입니다.";
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
}
