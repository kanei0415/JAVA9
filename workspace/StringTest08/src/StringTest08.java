
public class StringTest08 {
	public static void main(String[] args){
		
		String s1 = new String("ABC");
		String s2 = new String("ABC");
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println();
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println();
		
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		System.out.println();
		
		// intern() : 문자열을 constant pool에 등록한다. 이미 있으면 주소값을 반환 
		s1 = s1.intern();
		s2 = s2.intern();
		System.out.println("---- intern ----");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println();
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println();
		
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		System.out.println();
	}
}
