import java.util.Vector;

public class VectorTest06 {
	public static void main(String[] args) {
		
		Vector<String> v = new Vector<String>();
		
		String[] names = {"김연아","박찬호","이승엽","김연경","류현진"};
		
		for(int i=0; i<names.length; i++) v.add(names[i]);
		
		System.out.println("1. 벡터에 문자열을 저장.");
		System.out.println(v);
		System.out.println();
		
		System.out.println("2. 이승엽 다음에 손흥민을 추가");
		v.add(3, "손흥민");
		System.out.println(v);
		System.out.println();
		
		System.out.println("3. 박찬호를 삭제");
		v.remove("박찬호"); // 값으로 삭제
//		v.remove(1); 	  // index로 삭제
		System.out.println(v);
		System.out.println();
		
		System.out.println("4. 김연경을 이다영으로 변경");
		v.set(3, "이다영");
		System.out.println(v);
		System.out.println();
		
		// 출력 - 기본 for문
		for(int i=0; i<v.size(); i++) System.out.print(v.get(i) + " ");
		System.out.println();
		
		// 출력 - 확장 for문
		for(String s: v) System.out.print(s + " ");
		System.out.println();
		System.out.println();
		
	}
}
