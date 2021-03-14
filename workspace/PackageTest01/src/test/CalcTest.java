package test;

import calc.Calc;

// package의 사용목적 - 접근 권한을 제어하는 목적, class 분류하는 목적

// 클래스 앞에 public 유무에 따른 접근 권한
// 1. public 접근 클래스-클래스 앞에 public이 있는 경우
// 2. package(default) 접근 클래스-클래스 앞에 public이 없는 경우

public class CalcTest {
	public static void main(String[] args) {
		Calc c1 = new Calc();
		
		System.out.println("합계 : " + c1.add(10, 20));
		// method 앞에 public이 없으면 default 접근 권한
		// default접근 권한은 같은 package에서만 사용가능
		//System.out.println("뺄셈 : " + c1.sub(50, 30));
	}
}
