
public class Array2D01 {
	public static void main(String[] args) {
		// 1번 - 2차원 배열의 참조변수 선언, 초기화를 따로 분리
//		int[][] a;// int형의 2차원 배열의 참조변수 - 포인터의 포인터 // int *형의 1차원 배열의 참조변수
//		a = new int[3][];// int *형의 1차원 배열의 인스턴스 생성 및 참조
//		a[0] = new int[4];// int형의 1차원 배열의 인스턴스 생성 및 참조 및 gabage값 초기화
//		a[1] = new int[4];// int형의 1차원 배열의 인스턴스 생성 및 참조 및 gabage값 초기화
//		a[2] = new int[4];// int형의 1차원 배열의 인스턴스 생성 및 참조 및 gabage값 초기화
		
		// 2번 - 선언과 동시에 초기화
		int[][] a = new int[3][4]; // 3행 4열
		
		// 값 설정
		a[0][1] = 10;
		a[0][3] = 30;
		a[1][2] = 50;
		a[2][3] = 70;
		
		// 출력
//		System.out.println("a[0][0] = " + a[0][0]);
//		System.out.println("a[0][1] = " + a[0][1]);
//		System.out.println("a[0][3] = " + a[0][3]);
//		System.out.println("a[1][2] = " + a[1][2]);
//		System.out.println("a[2][3] = " + a[2][3]);
		
		// 일괄 처리
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				System.out.printf("%-2d ", a[i][j]);
			}
			System.out.println();
		}
	}
}
