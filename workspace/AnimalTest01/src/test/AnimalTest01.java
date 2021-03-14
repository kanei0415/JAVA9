package test;

import animal.*;

public class AnimalTest01 {
	public static void main(String[] args){
		
//		Aniaml a = new Animal("an"); // 추상클래스는 인스턴스를 만들 수 없음.
		
		// 1번
		Animal[] animals; // 인스턴스 선언
		animals = new Animal[] { // 초기화
			new Dog("해피", "비숑"),
			new Cat("노루", 5),
			new Dog("별이", "치와와"),
			new Cat("루미", 3),
		};
		
		// 2번
//		Animal[] animals = { // 인스턴스 선언 및 초기화
//				new Dog("해피", "비숑"),
//				new Cat("노루", 5),
//				new Dog("별이", "치와와"),
//				new Cat("루미", 3),
//		};
		
		for(int i=0; i<animals.length; i++) { // 기본 for문
			animals[i].print();
			System.out.println();
		}
		
		System.out.println();
		
		for(Animal a : animals) { // for-in문
			a.print();
			System.out.println();
		}
	}
}
