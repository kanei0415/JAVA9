import java.util.Scanner;

// 2020110761

// 정수를 입력받아서 좌하변이 직각인 직각삼각형을 출력 -> method
public class Method05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
//			for(int j=1; j<=i; j++)
//				System.out.print("*");
			putStar(i);
			System.out.println();
		}
		
		sc.close();
	}
	static void putStar(int i) {
		for(int j=1; j<=i; j++) 
			System.out.print("*");
	}
}
