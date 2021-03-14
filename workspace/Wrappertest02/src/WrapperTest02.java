
// 문자열 s : 10명의 학생의 시험성적을 문자열로 나열한 것
// 학생들의 시험점수의 총합과 평균을 구하고 출력하시오.
public class WrapperTest02 {
	public static void main(String[] args) {
		String s = "85, 88, 72, 91, 56, 73, 66, 87, 68, 95";
		
		String[] data = s.split(", "); // delimiter(", ")를 기준으로 토큰을 만들어 저장
		
		int sum = 0; // 총합
		double avg;  // 평균
		
		// 1.
//		for(int i=0; i<data.length; i++)
//			sum += Integer.parseInt(data[i]);// String을 int형으로 변환 해서 누적합
		
		// 2.
		for(String st : data)
			sum += Integer.parseInt(st); // String을 int형으로 변환 해서 누적합
		
		avg = (double)sum / data.length; // double 형으로 캐스팅해서 저장
		
		System.out.println("총합은 : " + sum);     // 총합 출력
		System.out.printf("평균은 : %.2f\n", avg); // 평균 출력
		
	}
}
