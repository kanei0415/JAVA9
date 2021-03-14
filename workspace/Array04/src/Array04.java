import java.util.Scanner;

// 5명의 학생의 점수를 저장한 scores의 배열로부터 학생들의 총합과 평균을 구하라
public class Array04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 선언
		int[] scores = new int[] {85, 93, 71, 63, 82};
		int sum = 0;
		double avg;
		
		// 계산
		for(int i=0; i<scores.length; i++) {
			sum += scores[i];
		}
		avg = (double)sum / scores.length;
		
		//출력
		System.out.println("총합은 " + sum +"입니다.");
		System.out.printf("평균은 %.2f입니다.\n",avg);
		
		sc.close();
	}
}
