
public class StringBufferTest04 {
	public static void main(String[] args) {
		
		StringBuffer sb1 = new StringBuffer();
		System.out.println(System.identityHashCode(sb1));
		System.out.println();
		
		// append() : 문자열의 내용을 덧붙이는 method
		sb1.append("HELLO JAVA WORLD!");
		System.out.println(sb1);
		System.out.println(System.identityHashCode(sb1));
		System.out.println();
		
		// charAt(index) : 인덱스에 해당하는 문자를 반환
		System.out.println(sb1.charAt(6));
		System.out.println(sb1.charAt(11));
		System.out.println();
		
		// ! 삭제
		// deleteCharAt() : index에 해당하는 한 문자를 삭제
		sb1.deleteCharAt(16);
		System.out.println(sb1);
		System.out.println(System.identityHashCode(sb1));
		System.out.println();
		
		// JAVA 삭제
		// delete() : 문자를 삭제하는 method
		sb1.delete(6, 10); // 6번부터 10번 앞까지 삭제
		System.out.println(sb1);
		System.out.println(System.identityHashCode(sb1));
		System.out.println();
		
		// insert() : 문자열을 삽입하는 method
		sb1.insert(6, "Android");
		System.out.println(sb1);
		System.out.println(System.identityHashCode(sb1));
		System.out.println();
		
//		sb1.append("~");
		sb1.insert(19, "~");
		System.out.println(sb1);
		System.out.println(System.identityHashCode(sb1));
		System.out.println();
		
		// replace() : 문자열을 변경
		sb1.replace(6, 13, "JAVA"); // 6번부터 13번 앞까지 -> half-closed interval
		System.out.println(sb1);
		System.out.println(System.identityHashCode(sb1));
		System.out.println();
		
	}
}
