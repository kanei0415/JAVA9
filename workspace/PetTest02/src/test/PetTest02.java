package test;

import pet.*;

// 다형성(Polymorphism) - 다양한 형태로 표현할 수 있는 성질
// - 다양한 형태의 객체를 담아 한꺼번에 처리할 수 있는 성질
public class PetTest02 {
	public static void main(String[] args) {
		// 배열을 이용한 다형성 구현
		// - 부모 클래스의 배열을 통해 부모와 자식을 한꺼번에 담아 사용
		// 1번
//		Pet[] pets = new Pet[4];
//		pets[0] = new Pet("나비", "문상태");
//		pets[1] = new RobotPet("마크1", "고문영");
//		pets[2] = new Pet("별이", "문강태");
//		pets[3] = new RobotPet("마크2", "이재수");

		// 2번
		Pet[] pets = new Pet[] {
				new Pet("나비", "문상태"),
				new RobotPet("마크1", "고문영"),
				new Pet("별이", "문강태"),
				new RobotPet("마크2", "이재수"),
		};

		// 객체의 배열을 반복문을 통해 한꺼번에 처리하고있다.
		
		// 1번 - 기본 for 문
//		for(int i=0; i<pets.length; i++) {
//			pets[i].introduce();
//			System.out.println();
//		}
		
		// 2번 - for-in문
		for(Pet p : pets) {
			p.introduce();
			
			// p가 RobotPet형의 인스턴스라면
			if(p instanceof RobotPet) {
				((RobotPet)p).work(2);
			}
				
			System.out.println();
		}
	}
}
