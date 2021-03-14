package pet;

// 자식  클래스 - 애완 로봇 클래스
public class RobotPet extends Pet{
	public RobotPet(String name, String masterName) {
		super(name, masterName);
	}
	
	// overriding
	// 메소드의 재정의
	// 오버라이딩의 규칙 
	// -오버라이딩하는 메소드는 부모클래스의 메소드보다 더 강한 접근제한을 사용할 수 없다.
	// -오버라이딩하는 메소드는 부모클래스의 메소드보다 동등하거나 약간 접근제한을 사용해야한다.
	
	// @ Annotation - 자바의 컴파일러에게 알려주는 주석

	@Override // 이 메소드는 오버라이딩한 메소드임을 확인
	public void introduce() {
		System.out.println("◎ 저는 로봇입니다. 이름은 " + getName() + "입니다.");
		System.out.println("◎ 저는 로봇입니다. 주인님의 이름은 " + getMasterName() + "입니다.");
	}
	
	public void work(int w) {
		switch(w) {
		case 1:
			System.out.println("청소를 합니다.");
			break;
		case 2:
			System.out.println("빨래를 합니다.");
			break;
		case 3:
			System.out.println("밥을 합니다.");
			break;
		default: break;
		}
	}
}
