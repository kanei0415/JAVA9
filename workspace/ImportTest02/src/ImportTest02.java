//1. 단일형 import
//import java.util.Scanner;
//import java.util.Random;

// 2. on-demand(주문형) import
import java.util.*;

public class ImportTest02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		
		// input number
		System.out.print("Enter the number(0~9) : ");
		int x = sc.nextInt();
		
		// random number
		int rn = r.nextInt(10); // 0~9 사이의 난수
		
		if(x == rn) {
			System.out.println("오늘은 행운이 있는 날입니다.");
		} else {
			System.out.println("오늘은 평범한 날입니다.");
		}
		
		sc.close();
	}
}
