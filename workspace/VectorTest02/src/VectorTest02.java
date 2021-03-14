import java.util.Vector;

// List 계열
// 1. 순서가 있다 -> index가 있다.
// 2. 중복 데이터를 허용.


public class VectorTest02 {
	public static void main(String[] args) {
		// raw type
//		Vector v = new Vector();
		
		// 학생들의 점수를 저장할 벡터 - 정수 타입
		Vector<Integer> v = new Vector<Integer>();
		
		// 데이터 추가
		v.add(25);
		v.add(82);
		v.add(77);
		v.add(65);
		v.add(72);
//		v.add(3.14);    // Error -> int형을 저장하는 벡터, double 저장 불가
//		v.add("HELLO"); // Error -> int형을 저장하는 벡터, String 저장 불가
		
		// 출력1 - 기본 for문
		int sum = 0;
		for(int i=0; i<v.size(); i++) sum += v.get(i);
		System.out.println("합계 = " + sum);
		System.out.println();
		
		// 출력2 - 확장 for 문
		sum = 0;
//		for(Integer i : v) sum += i;
		for(int i : v) sum += i;
		System.out.println("합계 = " + sum);
		System.out.println();
		
		// 확인
//		System.out.println(v.toString()); // toString() 은 생략가능
		System.out.println(v);
		System.out.println();
		
	}
}
