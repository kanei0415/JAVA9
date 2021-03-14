
// method를 만드는 규칙
// 1. 매개변수의 개수와 자료형을 반드시 일치시켜야함
// 2. return값과 return type은 반드시 일치해야한다.
// 3. return값은 한개 또는  void
public class Method01 {
	
	// method definition
	static int add(int x, int y) {
		int z = x + y;
		return z;
	}
	
	public static void main(String[] args) {
		int a = 10, b = 20;
		
		// method call
		int result = add(a, b);
		
		System.out.println("합계 : " + result);
	}
}
