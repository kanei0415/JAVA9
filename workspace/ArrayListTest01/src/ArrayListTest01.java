import java.util.ArrayList;
import java.util.Collections;

// ArrayList
// 1. Vector와 기능, 사용법이 동일
// 2. Vector는 쓰레드의 동기화 기능이 있어서 성능의 저하가 발생.
// -> ArrayList는 쓰레드의 동기화 기능을 제거하여 성능을 개선.
// 3. ArrayList는 Vector의 capacity() 메소드는 없음.

public class ArrayListTest01 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		int[] scores = {75, 88, 75, 63, 52, 77, 47, 48, 93, 91};
		
		System.out.println("1. 리스트에 학생의 점수 저장");
		for(int i=0; i<scores.length; i++) list.add(scores[i]);
		System.out.println(list);
		System.out.println();
		
		System.out.println("2. 리스트에서 60점 미만의 데이터 삭제");
		// 해결 1 - 인덱스를 보정한다.
//		for(int i=0; i<list.size(); i++) {
//			if(list.get(i) < 60) list.remove(i); // 발견하면 바로 삭제하여 다음 data 하나를 건너뛴다.
//			if(list.get(i) < 60) list.remove(i--); // 삭제하고 나면 인덱스를 보정한다.		
//		}
		
		
		// 해결 2 - 맨 뒤에서부터 찾도록 변경한다.
		for(int i=list.size()-1; i>=0; i--) {
			if(list.get(i) < 60) list.remove(i);
		}
		System.out.println(list);
		System.out.println();
		
		System.out.println("3. 리스트의 총점과 평균을 계산");
		int sum = 0;
		double avg;
		for(int i=0; i<list.size(); i++) sum += list.get(i);
		avg = (double)sum / list.size();
		System.out.println("sum : " + sum + " avg : " + avg);
		System.out.println();
		
		System.out.println("4. 리스트의 최댓값과 최솟값을 찾는다.");
		int max = list.get(0), min = list.get(0);
		for(int i=0; i<list.size(); i++) {
			if(max < list.get(i)) max = list.get(i);
			if(min > list.get(i)) min = list.get(i);
		}
		System.out.println("max : " + max + " min : " + min);
		System.out.println();
		
		System.out.println("5. 출력 - 기본 for문");
		for(int i=0; i<list.size(); i++) System.out.print(list.get(i) + " ");
		System.out.println();
		System.out.println();
		
		System.out.println("5. 출력 - 확장 for문");
		for(Integer i : list) System.out.print(i + " ");
		System.out.println();
		
		System.out.println("- 리스트를 오름차순으로 정렬 -");
		Collections.sort(list); // 오름차순 정렬
		System.out.println(list);
		System.out.println("max : " + list.get(list.size()-1) + " min : " + list.get(0));
		System.out.println();
	}
}
