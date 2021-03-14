import java.util.Scanner;

// 2020110761
// input
// 학생수를 입력하세요 : 5
// 1번 : 93 93 92
// 2번 :	85 85 86
// 3번 :	71 71 72
// 4번 :	68 68 67
// 5번 :	83 83 82
// output
//    |국어 | 수학 | 영어| 총점 |  평균
// 1번 : 93 | 93 | 92 | 278 | 92.67
// 2번 :	85 | 85 | 86 | 256 | 85.33
// 3번 :	71 | 71 | 72 | 214 | 71.33
// 4번 :	68 | 68 | 67 | 203 | 67.67
// 5번 :	83 | 83 | 82 | 248 | 82.67
public class Array2D03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 입력
		System.out.print("학생수를 입력하세요 : ");
		int studentNum = sc.nextInt();
		int[][] score = new int[studentNum][3];
		for(int i=0; i<score.length; i++) {
			System.out.print((i+1) + "번 : ");
			for(int j=0; j<score[i].length; j++) 
				score[i][j] = sc.nextInt();
		}
		
		// 계산
		int[] sum = new int[studentNum];
		double[] avg = new double[studentNum];
		for(int i=0; i<score.length; i++) {
			for(int j=0; j<score[i].length; j++) 
				sum[i] += score[i][j];
			avg[i] = (double)sum[i] / (score[i].length);
		}
		
		// 출력
		System.out.println("--------------------------------");
		System.out.println("   |국어 | 수학 | 영어| 총점  |  평균  ");
		for(int i=0; i<studentNum; i++) {
			System.out.printf("%d번 : %d | %d | %d | %d | %.2f\n", i+1, score[i][0], score[i][1], score[i][2], sum[i], avg[i]);
		}
		System.out.println("--------------------------------");
		
		sc.close();
	}
}
