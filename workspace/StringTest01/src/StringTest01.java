
public class StringTest01 {
	public static void main(String[] args) {
		// 문자열 리터럴
		String s1 = "ABC";
		String s2 = "XYZ";
		String s3 = "ABC"; // 기존에 있는 문자열을 참조, 새로운 문자열을 생성하는 것은 아님.
		String s4 = "DEF";
		
		s4 = s1; // s4는 s1이 참조하는 곳을 같이 참조하게 됨. JVM의 Garbage Collector가 Garbage Collection을 하게 된다. -> 메모리 누수가 없음
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println("----------");
		
		// 해시코드(hashCode) : 각각의 인스턴스가 가지는 고유한 id
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
		System.out.println("----------");
		
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		System.out.println(System.identityHashCode(s3));
		System.out.println(System.identityHashCode(s4));
		System.out.println("----------");
	}
}
