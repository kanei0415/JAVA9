
public class StringTest05 {
	public static void main(String[] args) {
		
		char[] c = {'H','E','L','L','O','!'};
		String s = new String(c);
		System.out.println(s);
		System.out.println();
		
		String s1 = "HELLO JAVA WORLD!";
		// charAt(index) : 인덱스에 해당하는 문자 하나를 반환
		char ch = s1.charAt(6);
		System.out.println(ch);
		System.out.println();
		
		// concat(String) : 문자열을 연결하는 메소드
		System.out.println(s1.concat(" KOREA!")); // instance 생성
		System.out.println(s1);
		s1 = s1.concat(" KOREA!");
		System.out.println(s1);
		System.out.println();
		
		// contains(subString) : 문자열에 포함여부를 boolean값으로 반환
		System.out.println(s1.contains("JAVA"));
		System.out.println(s1.contains("java"));
		System.out.println();
		
		// endsWith(suffix) : 지정한 문자열로 끝나는지 여부를 boolean값으로 반환
		String s2 = "programming.pdf";
		String s3 = "pragramming.hwp";
		System.out.println(s2.endsWith(".pdf"));
		System.out.println(s3.endsWith(".pdf"));
		System.out.println();
		
		// startsWith(prefix) : 지정한 문자열로 시작하는지 여부를 boolean값으로 반환
		String s4 = "java.lang.Math";
		String s5 = "android.text.Object";
		System.out.println(s4.startsWith("java"));
		System.out.println(s5.startsWith("java"));
		System.out.println();
		
		// indexOf(char ch) : 선택한 문자혹은 문자열에 대한 index를 int로 반환
		String s6 = "HELLO JAVA WORLD!";
		int index1 = s6.indexOf('J');
		System.out.println(index1);

		int index2 = s6.indexOf("WORLD!");
		System.out.println(index2);
		
		int index3 = s6.indexOf('X');
		System.out.println(index3); // -1 : 배열의 인덱스로 사용할 수 없음.
		System.out.println();
		
		// lastIndexOf(char ch) : 마지막에서부터 첫 번째로 찾은 문자의 인덱스를 알려준다.
		int index4 = s6.indexOf('L');
		System.out.println(index4); // 처음에서부터 첫 번째로 찾은 문자의 인덱스를 알려준다.
		
		int index5 = s6.lastIndexOf('L');
		System.out.println(index5); // 마지막에서부터 첫 번째로 찾은 문자의 인덱스를 알려준다.
		System.out.println();
		
		// length() : 문자열의 길이 반환
		System.out.println(s6.length());
	}
}
