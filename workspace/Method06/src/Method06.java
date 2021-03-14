import java.util.Scanner;

// 정수와 문자를 입력받아서 좌하변이 직각인 직각삼각형 입력 받은 문자로 출력-> method
public class Method06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 입력
		System.out.print("정수 입력 : ");
		int n = sc.nextInt();
		System.out.print("문자 입력 : ");
		char c = sc.next().charAt(0);
		
		// 출력
		putChar(n, c);
		
		sc.close();
	}
	
	static void putChar(int n, char c) {
		for (int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) 
				System.out.print(c);
			
			System.out.println();
		}
	}
}
