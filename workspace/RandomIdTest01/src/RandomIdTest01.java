import java.util.Random;

// count의 초기값을 0, 100, 200, 300, 400, 500, 600, 700, 800, 900
// 중에서 하나의 값을 생성하여 클래스 변수에 초기화를 하고 사용하겠다.
class RandomId{
	private static int count = 0; // class variable
	private int id;
	
	// 클래스 초기자(static initializer)
	// 클래스가 사용되기 직전에 딱 한번만 호출
	static {
		// 난수를 생성하는 class
		Random r = new Random();
//		count = r.nextInt(10); // 0~9 사이의 난수 생성
//		count = r.nextInt(100); // 0~99 사이의 난수 생성
		count = r.nextInt(10) * 100; // 0 ~ 900 사이의 100의 배수 난수 생성
	}
	
	public RandomId() {
		id = ++count;
	}
	
	public int getId() {
		return id;
	}
	
	public static int getCount() {
		return count;
	}
}


public class RandomIdTest01 {
	public static void main(String[] args) {
		RandomId a = new RandomId();
		RandomId b = new RandomId();
		RandomId c = new RandomId();
		
		System.out.println("a의 id = " + a.getId());
		System.out.println("b의 id = " + b.getId());
		System.out.println("c의 id = " + c.getId());
		
		System.out.println("현재까지 사용된 count = " + RandomId.getCount());
	}
}
