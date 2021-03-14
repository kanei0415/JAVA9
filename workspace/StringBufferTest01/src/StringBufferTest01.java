
public class StringBufferTest01 {
	public static void main(String[] args) {
		
		// String class의 인스턴스는 immutable하다 -> 값 변경시 새로운 인스턴스를 만든다.
		// 값을 변경하기 전과 후의 instance의 hashCode가 다르다.
		// String class의 immutable한 성질
		
		String s1 = "ABC";
		System.out.println(s1);
		System.out.println(System.identityHashCode(s1));
		
		s1 += "DEF";
//		s1 = s1.concat("DEF");
		System.out.println(s1);
		System.out.println(System.identityHashCode(s1));
		System.out.println();
		
		StringBuffer sb1 = new StringBuffer("ABC");
		System.out.println(sb1);
		System.out.println(System.identityHashCode(sb1));
		System.out.println();
		
		sb1.append("DEF");
		System.out.println(sb1);
		System.out.println(System.identityHashCode(sb1));
		System.out.println();
		
	}
}
