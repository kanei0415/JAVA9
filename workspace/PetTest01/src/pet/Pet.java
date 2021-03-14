package pet;

// 부모 class - 애완동물 class
public class Pet {
	private String name; // 이름
	private String masterName; // 주인이름
	
	public Pet(String name, String masterName) {
		this.name = name;
		this.masterName = masterName;
	}
	
	public Pet() {
		
	}
	
	public String getName() {
		return name;
	}
	public String getMasterName() {
		return masterName;
	}
	
	// 자기소개 메소드
	public void introduce() {
		System.out.println("◆ 내 이름은 " + name + "입니다.");
		System.out.println("◆ 내  주인님의 이름은 " + masterName + "입니다.");
	}
}
