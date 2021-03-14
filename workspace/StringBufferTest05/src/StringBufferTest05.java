// StringBuffer, StringBuilder는 기능상의 차이가 거의 없다.
// StringBuffer  : 이후 버전, 쓰레드의 기능을 제거하여 성능을 개선.
// StringBuilder : 이전 버전, 쓰레드의 기능이 있어서, 성능의 저하가 발생.

public class StringBufferTest05 {
	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer();
//		StringBuilder sb1 = new StringBuilder();
		
		// 문자열 덧붙이기
		sb1.append("HELLO JAVA WORLD!");
		System.out.println(sb1);
		System.out.println();
		
		// reverse() : 문자열을 거꾸로 뒤집어 저장
		sb1.reverse();
		System.out.println(sb1);
		System.out.println();
		
		sb1.reverse();
		System.out.println(sb1);
		System.out.println();
		
		// setCharAt() : 인덱스에 해당하는 한 문자를 변경
		sb1.setCharAt(16, '~');
		System.out.println(sb1);
		System.out.println();
		
		// setLength() : 크기를 변경하는 method
		System.out.println(sb1);
		System.out.println(sb1.length());
		System.out.println();
		
		sb1.setLength(10);

		System.out.println(sb1);
		System.out.println(sb1.length());
		System.out.println();
		
		// substring() : 문자열을 추출, return type -> String
		String s1 = sb1.substring(6);
		System.out.println(s1);
		System.out.println();
		
	}
}
