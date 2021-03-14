package test;

import pet.*;


public class PetTest01 {
	public static void main(String[] args) {
		Pet happy = new Pet("해피", "채송화");
		happy.introduce();
		
		System.out.println();
		
		RobotPet mark1 = new RobotPet("마크1", "장겨울");
		mark1.introduce();
		System.out.println();
		
		Pet mary;
//		mary = happy;
		mary = mark1;
		
		mary.introduce(); // 동적 바인딩 - 참조 변수의 타입이 아니라 실체의 메소드를 출력
	}
}
