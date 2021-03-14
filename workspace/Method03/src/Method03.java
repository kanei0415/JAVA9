import java.util.Scanner;

// 2020110761
// 반지름을 통해 원의 면적과 원의 둘레를 구하는 method를 구현하고 출력하라

public class Method03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//입력
		System.out.print("원의 반지름 입력 : ");
		double radious = sc.nextDouble();
		
		//계산
		final double PI = 3.14;
		double area = calcArea(PI, radious);
		double perimeter = calcPerimeter(PI, radious);
		
		//출력
		System.out.printf("원의 면적은 %.2f입니다.\n", area);
		System.out.printf("원의 둘레는 %.2f입니다.\n", perimeter);
		
		sc.close();
	}
	// 원의 면적을 구하는 method
	static double calcArea(final double PI, double radious){
		return radious * radious * PI;
	}
	// 원의 둘레를 구하는 method
	static double calcPerimeter(final double PI, double radious) {
		return 2 * radious * PI;
	}
}
