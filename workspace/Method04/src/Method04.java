import java.util.Scanner;

// 2020110761
// a의 b승을 구하는 프로그램 -> method
// a : 3, b : 4, result : 3을 4번 곱한 결과 81

public class Method04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 입력
		System.out.print("정수 a 입력 : ");
		int a = sc.nextInt();
		System.out.print("정수 b 입력 : ");
		int b = sc.nextInt();
		
		int result = calcPower(a, b);
		
		System.out.println(a + "의 " + b + "제곱한 결과 " + result);
		
		sc.close();
	}
	// a의  b거듭제곱을 구하는 method
	static int calcPower(int a, int b) {
		if(b == 1)
			return a;
		else
			return a * calcPower(a, b-1);
	}
}
