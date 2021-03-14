import java.util.Vector;

public class VectorTest03 {
	public static void main(String[] args) {
		
		Vector<Integer> v = new Vector<Integer>();
		
		int[] a = {10, 20, 30, 40, 50};
		
		// data를 추가(순차적 삽입)
		for(int i=0; i<a.length; i++) v.add(a[i]);
		System.out.println(v);
		
		// 데이터를 삽입(비순차적, 중간 삽입)
		v.add(2, 60);
		System.out.println(v);
		
		// data 1개 삭제
		v.remove(3); // 30을 삭제
		System.out.println(v);
			
		// 데이터를 변경
		v.set(3, 70);
		System.out.println(v);
		
		// 첫 번째 data를 출력
		System.out.println(v.firstElement());
		System.out.println(v.get(0));
		
		// 마지막 data를 출력
		System.out.println(v.lastElement());
		System.out.println(v.get(v.size()-1));
		
		// index에 해당하는 값을 출력
		System.out.println(v.get(3));
		System.out.println(v.elementAt(3));
		
		// 지정한 value에 해당하는 index를 출력하는 방법
		System.out.println(v.indexOf(70));
		System.out.println(v.indexOf(90)); // 해당하는 값이 없으면 -1을 출력
		
		v.add(20);
		System.out.println(v);
		// 값에 해당하는 인덱스를 출력(앞에서부터)
		System.out.println(v.indexOf(20));
		
		// 값에해당하는 인덱스를 출력(뒤에서부터)
		System.out.println(v.lastIndexOf(20));
		
		// 값에 해당하는 인덱스를 출력 (지정한 위치부터 찾음)
		System.out.println(v.indexOf(20, 3));
		
		// 비순차적 추가 - add(), insertElementAt()
		v.add(2, 80);
//		v.insertElementAt(80, 2);
		System.out.println(v);
		
		// 크기 확인
		System.out.println(v.size());
		
		// 크기 변경
		v.setSize(5);
		System.out.println(v);
		System.out.println(v.size());
		
		// 모든 데이터 삭제
		v.clear();
//		v.removeAllElements();
		System.out.println(v);
		System.out.println(v.size());
		
	}
}
