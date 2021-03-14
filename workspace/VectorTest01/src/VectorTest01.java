import java.util.Vector;

public class VectorTest01 {
	public static void main(String[] args) {
		
		// Warning
		// Raw type : 저장할 data의 type이 정하지 않고 사용하는 것 -> 문제가 발현될 소지가 크다.
		
		// 벡터 생성
		Vector v = new Vector();

		v.add(10);
		v.add(3.14);
		v.add("HELLO");
		
		System.out.println(v.get(0));
		System.out.println(v.get(1));
		System.out.println(v.get(2));
		System.out.println();
		
		System.out.println("용량 : " + v.capacity());
		System.out.println("크기 : " + v.size());
		System.out.println();
		
		v.add(20);
		v.add("JAVA");
		
		// 출력 - 기본 for문
		for(int i=0; i<v.size(); i++)
			System.out.println(v.get(i));
		System.out.println();
		
		// 출력 - 확장 for문
		for(Object o : v)
			System.out.println(o);
		System.out.println();
		
	}
}
