
public class ForIn01 {
	public static void main(String[] args) {
		// 1차원 배열
		int[] a = {10, 20, 30, 40, 50};
		
		// 1. 기본 for문
		for(int i=0; i<a.length; i++) {
		 System.out.print(a[i] + " ");
		}
		System.out.println();
		
		// 2. enhanced for, 확장 for문, for-in문, for-each문
		// 처음부터 끝까지  모두 접근해서 사용.
		// index를 통해 접근하는 방법이 아니므로 접근 range를 제한하는 것이 불가능 
		for (int i : a) {
			System.out.print(i + " ");
		}
		System.out.println();
		
	}
}
