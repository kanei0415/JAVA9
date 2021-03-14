import java.util.Scanner;

public class StringTest03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the String1 : ");
		String s1 = sc.next();
		System.out.print("Enter the String2 : ");
		String s2 = sc.next();
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println("----------");
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println("----------");
		
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		System.out.println("----------");
		
		if(s1 == s2) { // == : 참조형인 문자열은 값을 비교한는 것이 아니라, 참조를 비교함. 
			System.out.println("Referance is Same");
		} else {
			System.out.println("Referance is Not Same");
		}
		System.out.println("----------");
		
		if(s1.equals(s2)) { // equals() : 값을 비교하는 메소드
			System.out.println("내용이 같습니다.");
		} else {
			System.out.println("내용이 다릅니다.");
		}
		System.out.println("----------");
		
		if(s1.equalsIgnoreCase(s2)) { // equalsIgnoreCase() : 영어의 대소문자를 구분없이 비교하는 메소드
			System.out.println("대소문자 구분없이 내용이 같습니다.");
		} else {
			System.out.println("대소문자 구분없이 내용이 다릅니다.");
		}
		System.out.println("----------");
		
		sc.close();
	}
}
