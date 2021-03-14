import java.util.Scanner;

public class Array05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 입력
		System.out.print("학생수를 입력하세요 : ");
		int studentNum = sc.nextInt();
		int[] scores = new int[studentNum];
		System.out.print("점수를 입력하세요 : ");
		for(int i=0; i<scores.length; i++) {
			scores[i] = sc.nextInt();
		}
		
		// 선언
		int sum = 0;
		double avg;
		
		// 계산
		for(int i=0; i<scores.length; i++) { // studentNum == scores.length -> true
			sum += scores[i];
		}
		avg = (double)sum / scores.length; // studentNum == scores.length -> true
		
		// 출력
		System.out.println("총점은 " + sum + "입니다.");
		System.out.printf("평균은 %.2f입니다.\n",avg);
		
		sc.close();
	}
}
