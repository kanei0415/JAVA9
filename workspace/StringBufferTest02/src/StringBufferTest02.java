
public class StringBufferTest02 {
	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer("ABC");
		StringBuffer sb2 = new StringBuffer("ABC");
		
		System.out.println(sb1);
		System.out.println(sb2);
		System.out.println();
		
		System.out.println(System.identityHashCode(sb1));
		System.out.println(System.identityHashCode(sb2));
		System.out.println();
		
		// StringBuffer class의 equals()는 Object class의 메소드를 그대로 사용하는 것
		// Object class의 equals()는 참조를 비교하도록 만들어져 있음.
		// String class의 equals()는 내용을 비교하도록  Overriding하여 사용함.
		
		System.out.println(sb1 == sb2); // 참조를 비교 false
		System.out.println(sb1.equals(sb2)); // 참조를 비교 false
		System.out.println();
		
		// 해결책
		// StringBuffer의 instance를 String class로 바꿔서 비교한다.
		
		String s1 = sb1.toString();
		String s2 = sb2.toString();
	
		System.out.println(s1);
		System.out.println(s2);
		System.out.println();
		
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		System.out.println();
		
		System.out.println(s1 == s2); // 참조를 비교 false
		System.out.println(s1.equals(s2)); // 참조의 내용을 비교 true
		System.out.println();
		
	}
}
