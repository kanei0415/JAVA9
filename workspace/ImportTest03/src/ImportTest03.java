import java.util.Scanner;
// Math class - 수학에 관한 다양한 함수와 상수가 정의되어있는 class
// lang package는 java에서 필수적으로 사용해야하는 class를 포함하고있다.
// lang package의 class를 사용할 때는 따로 import 하지 않아도 자동으로 import 하게된다. 
//import java.lang.Math;

// 3. static on-demand import
import static java.lang.Math.*;

// 3. static 단일형 import
import static java.lang.Math.PI;
import static java.lang.Math.sqrt;
import static java.lang.Math.abs;

// 이 프로그램에서 Math class의 method를 많이 활용해야 한다면, 
public class ImportTest03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the radius : ");
		double radius = sc.nextDouble();
		System.out.print("Enter the x and y : ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		System.out.print("Enter the number(n < 0) : ");
		int n = sc.nextInt();
		
		double peri = 2 * PI * radius;
		double area = PI * radius * radius;
		double dist = sqrt(x*x + y*y);
		int abs = abs(n);
		
		System.out.println("원의 둘레는 " + peri);
		System.out.println("원의 넓이는 " + area);
		System.out.println("거리는 " + dist);
		System.out.println("절댓값은 " + abs);
		System.out.println("원주율은 " + Math.PI);
		sc.close();
	}
}
