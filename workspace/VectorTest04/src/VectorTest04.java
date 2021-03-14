import java.util.Vector;

public class VectorTest04 {
	public static void main(String[] args) {
		
		Vector<Integer> v1 = new Vector<Integer>();
		Vector<Integer> v2 = new Vector<Integer>();
		Vector<Integer> v3 = new Vector<Integer>();
		
		v1.add(10); v1.add(20); v1.add(30);
		v2.add(40); v2.add(50); v2.add(60);
		v3.add(30); v3.add(40); v3.add(50);
		
		System.out.println("v1 : " + v1);
		System.out.println("v2 : " + v2);
		System.out.println("v3 : " + v3);
		System.out.println();
		
		System.out.println("- 벡터에 다른 벡터의 내용을 모두 추가 -");
		
		v1.addAll(v2);   // 순차적으로 추가
//		v1.addAll(1,v2); // 중간에서 추가
		System.out.println("v1 : " + v1);
		System.out.println("v2 : " + v2);
		System.out.println("v3 : " + v3);
		System.out.println();
		
		System.out.println("- 벡터에서 data의 존재유무 확인(1개) -");
		System.out.println(v1.contains(50));
		System.out.println(v1.contains(70));
		System.out.println();
		
		System.out.println("- 벡터에서 다른벡터의 모든 data의 존재유무 확인");
		System.out.println(v1.containsAll(v2));
		System.out.println(v2.containsAll(v3));
		System.out.println();
		
		System.out.println("- 벡터를 복제한다 -");
		@SuppressWarnings("unchecked")
		Vector<Integer>v4 = (Vector<Integer>)v1.clone();
		System.out.println("v4 : " + v4);
		System.out.println();
	}
}
