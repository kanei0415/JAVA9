
// Wrapper Class
// 1. 기본형에 대한 8가지 클래스의 통칭.
// byte-Byte, short-Short, int-Integer, long-Long,
// float-Float, double-Double, char-Character, boolean-Boolean
// 2. 목적1. : 기본형을 참조형으로 만들어서 자바 객체의 세상에서 사용하기 위함이다.
// 2. 목적2. : 문자열을 기본형으로 변경하기 위함이다.

// Boxing : 기본형을 참조형으로 만드는 것.
// UnBoxing : 객체형을 다시 기본형으로 만드는 것.

public class WrapperTest01 {
	public static void main(String[] args) {
		
		int i = 10; 				 // 기본형
		Integer ii = new Integer(i); // 객체형, 박싱(Boxing)
		
		System.out.println(i);
		System.out.println(ii);
		System.out.println();
		
		int i2 = ii.intValue(); // 언박싱(UnBoxing)
		i2 += 20;
		
		System.out.println(i2);
		System.out.println();
		
		int j = 10; // 기본형
		Integer jj = j; // 객체형, 자동박싱(AutoBoxing)
		
		System.out.println(j);
		System.out.println(jj);
		System.out.println();
		
		int j2 = jj + 20; // 자동언박싱(AutoUnBoxing)
		
		System.out.println(j2);
		System.out.println();
		
		String s1 = "10"; // String -> 연산 불가능
		System.out.println(s1 + 20); // String 형태로 연결
		int a = Integer.parseInt(s1) + 20; // 문자열을 정수형으로 변경
		
		System.out.println(a);
		System.out.println();
		
		String s2 = "3.14"; // String -> 연산 불가능
		int r = 5;
		double area = Double.parseDouble(s2) * r * r; // 문자열을 실수형으로 변경해서 연산가능
		
		System.out.println(area);
		System.out.println();
		
	}
}
