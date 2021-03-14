import java.util.Scanner;

// 두 개의 수를 입력하여 곱셈을 하는 프로그램 -> 메소드로 변경

// method - function, 특정 기능을 수행하는 명령의 단위체

// method define rule
// 1. argument와  parameter 의 data type과 개수 일치시킨다
// 2. return값은 반드시 1개 또는 void 에서는 return 이 없다.
// 3. return값과 return type은 반드시 일치해야한다.

// 권장 - method name은 동사형으로 만들자, parameter name 의미있게 만든다.

public class Method02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 입력
		System.out.print("실수a 입력 : ");
		double a = sc.nextDouble();
		System.out.print("실수b 입력 : ");
		double b = sc.nextDouble();
		
		// 계산
		//double result = a * b;
		double result = multiply(a, b);
		
		// 출력
		System.out.println("a * b = " + result);
		
		sc.close();
	}
	// method define
	static double multiply(double a, double b) {
		return a * b;
	}
}
