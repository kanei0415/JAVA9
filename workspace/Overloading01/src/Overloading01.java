
// Overloading
// 1. method의 다중정의
// 2. method의 name은 같지만 argument의 갯수나 type을 다르게 하여 method를 정의하는 것
// 주의) return type과 arguments의 name은 overloading에 포함되지 않는다.

public class Overloading01 {
	
	static int add(int a, int b) {
		return a + b;
	}
	
	static double add(double a, double b) {
		return a + b;
	}
	
//	// 중복정의, return type은 overloading과 관계없다
//	static double add(int a, int b) {
//		return (double)a + b;
//	}
	
	// 중복정의, arguments의 name은 overloading과 관계없음
//	static int add(int x, int y) {
//		return x + y;
//	}
	
	static int add(int x) {
		return ++x;
	}
	
	public static void main(String[] args) {
		
		System.out.println(add(10, 20));
		System.out.println(add(3.5, 4.3));
		System.out.println(add(10));
	}
}
