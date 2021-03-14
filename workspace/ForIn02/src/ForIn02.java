
public class ForIn02 {
	public static void main(String[] args) {
		int[][] a = {
				{10, 20, 30, 40},
				{50, 60, 70, 80},
				{90, 91, 92, 93},
		};
		
		// 1. 기본for문
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		// 2. 확장for문, for-in문, for-each문
		// index를 사용하는 것이 아니기 때문에 처음부터 끝까지 라는 전제하에 사용한다.
		// slicing을 하려면 기본 for문을 사용해야한다.
		for(int[] i : a) {
			for(int j : i) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}
