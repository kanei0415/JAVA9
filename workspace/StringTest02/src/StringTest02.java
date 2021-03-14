
public class StringTest02 {
	public static void main(String[] args) {
		String s1 = new String("ABC");
		String s2 = new String("XYZ");
		String s3 = new String("ABC");
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println("----------");
		
		// new는 인스턴스를 새롭게 생성.
		// s1과 s3의 해쉬코드가 같게 나타남 -> String 클래스에서는 문자열의 내용이 같다면 hashCode가 같게 나타나도록 Overriding함.
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		System.out.println("----------");
		
		// 본래의 문자열의 해시코드를 확인하는 방법
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		System.out.println(System.identityHashCode(s3));
		System.out.println("----------");
	}
}
