
public class Array2D02 {
	public static void main(String[] args) {
		// 3번 - 2차원 배열을 선언하고, 값으로 바로 초기화
		int[][] a = { // new int[][] 생략가능
			{10, 20, 30, 40},
			{50, 60, 70, 80},
			{90, 91, 92, 93},
		};
		
		// 4번 - 선언과 값의 초기화를 분리
//		int[][] a;
//		a = new int[][]{ // new int[][] 생략불가능
//				{10, 20, 30, 40},
//				{50, 60, 70, 80},
//				{90, 91, 92, 93},
//		};
		
		
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				System.out.printf("%2d ",a[i][j]);
			}
			System.out.println();
		}
	}
}
