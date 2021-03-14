
public class StringTest07 {
	public static void main(String[] args) {
		
		// split() : 측정 delimiter를 기준으로 잘라서 배열 생성
		String animals = "lion, tiger, bear, snake, monkey";
		String[] a = animals.split(", ");
		
		// 1번
		for(int i=0; i<a.length; i++)
			System.out.println(a[i]);
		System.out.println();
		
		// 2번
		for (String s : a)
			System.out.println(s);
		System.out.println();
		
		// substring() : 문자열을 추출
		String s1 = "HELLO JAVA WORLD!";
		String s2 = s1.substring(6, 9); // 6번부터 9번 앞까지 추출 -> half-closed interval
		System.out.println(s2);
		
		String s3 = s1.substring(6, 10); // 6번부터 10번 앞까지 추출
		System.out.println(s3);
		
		String s4 = s1.substring(11, 17); // 11번부터 17번 앞까지 추출
		System.out.println(s4);
		
		String s5 = s1.substring(11); // 11번부터 끝까지 추출
		System.out.println(s5);
		
	}
}
