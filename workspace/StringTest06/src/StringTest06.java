
public class StringTest06 {
	public static void main(String[] args) {
		String s1 = "HELLO JAVA WORLD!";
		
		// replace : 문자열의 일부를 새로운 문자열로 변경(모든 문자 변경)
		System.out.println(s1.replace("!", "~!"));
		System.out.println(s1);
		
		s1 = s1.replace("!", "~!");
		System.out.println(s1);
		
		s1 = s1.replace("L", "l");
		System.out.println(s1);
		System.out.println();
		
		// replaceFirst() : 첫 번째 일치하는 문자열만 변경
		s1 = s1.replaceFirst("A","a");
		System.out.println(s1);
		System.out.println();
		
		// toUpperCase() : 모든 문자를 대문자로 변경
		s1 = s1.toUpperCase();
		System.out.println(s1);
		System.out.println();
		
		// toLowerCase() : 모든 문자를 소문자로 변경
		s1 = s1.toLowerCase();
		System.out.println(s1);
		System.out.println();
		
		// trim() : 문자열을 앞뒤의 공백을 제거
		String s2 = "     HELLO      JAVA      WORLD!     ";
		System.out.println(s2 + "*");
		s2 = s2.trim();
		System.out.println(s2 + "*");
		
	}
}
