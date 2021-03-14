
public class StringTest04 {
	public static void main(String[] args) {
		String s1; 
		
		String s2 = "ABC";
		String s3 = null; // null상태 : 아무것도 참조하고 있지 않는 상태
		String s4 = ""; // 빈 문자열
		
//		System.out.println(s1); // Error
		System.out.println("s2 = " + s2);
		System.out.println("s3 = " + s3);
		System.out.println("s4 = " + s4);
		System.out.println("---------");
		
//		System.out.println("s1 = " + s1.hashCode()); // Error
		System.out.println("s2 = " + s2.hashCode());
//		System.out.println("s3 = " + s3.hashCode()); // Error
		System.out.println("s4 = " + s4.hashCode());
		System.out.println("---------");
		
//		System.out.println(System.identityHashCode(s1)); // Error
		System.out.println(System.identityHashCode(s2));
		System.out.println(System.identityHashCode(s3));
		System.out.println(System.identityHashCode(s4));
	}
}
