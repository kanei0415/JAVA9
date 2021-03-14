import java.util.Scanner;

public class DayTest03 {
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		
		int y, m ,d;
		
		System.out.print("<Enter the day1>");
		System.out.print("Enter the year : ");
		y = sc.nextInt();
		System.out.print("Enter the month : ");
		m = sc.nextInt();
		System.out.print("Enter the date : ");
		d = sc.nextInt();
		Day day1 = new Day(y, m, d);
		System.out.println();
		
		System.out.print("<Enter the day2>");
		System.out.print("Enter the year : ");
		y = sc.nextInt();
		System.out.print("Enter the month : ");
		m = sc.nextInt();
		System.out.print("Enter the date : ");
		d = sc.nextInt();
		Day day2 = new Day(y, m, d);
		
		// 입력한 2개의 Day instance를 비교
		
		// 잘못된 방법
		// reference를 비교하므로 instance의 속성이 같아도 false가 나온다.
//		if(day1 == day2) {
//			System.out.println("두 날짜는 같습니다.");
//		} else {
//			System.out.println("두 날짜는 다릅니다.");
//		}
		
		// 1.옳은 방법 - if안에 식이 복잡함 -> 알고리즘 활용도가 낮음
//		if(day1.getYear()==day2.getYear() && day1.getMonth()==day2.getMonth() && day1.getDate()==day2.getDate()) {
//			System.out.println("두 날짜는 같습니다.");
//		} else {
//			System.out.println("두 날짜는 다릅니다.");
//		}
		
		// 2. 옳은 방법 - method를 활용함으로써 알고리즘 활용도가 높음
//		if(isSame(day1, day2)) {
//			System.out.println("두 날짜는 같습니다.");
//		} else {
//			System.out.println("두 날짜는 다릅니다.");
//		}
		
		// 3. 옳은 방법 - 날짜를 비교하는 method도 Day Class 의 member method로 포함시킨다. 
		if(day1.isSame(day2)) {
			System.out.println("두 날짜는 같습니다.");
		} else {
			System.out.println("두 날짜는 다릅니다.");
		}
		
		
		sc.close();
	}
	
//	static boolean isSame(Day day1, Day day2) {
//		return day1.getYear()==day2.getYear() && day1.getMonth()==day2.getMonth() && day1.getDate()==day2.getDate();
//	}
}

//날짜 Class
//instance variable : year month date
//constructor getter setter print setAll
class Day{
	// instance variable
	private int year;
	private int month;
	private int date;
	
	// constructor overloading
	public Day(int year, int month, int date){
		this.year = year;
		this.month = month;
		this.date = date;
	}
	// copy constructor
	public Day(Day birthday) {
		this.year = birthday.year;
		this.month = birthday.month;
		this.date = birthday.date;
	}
	
	// instance method
	// getter method
	public int getYear() {
		return year;
	}
	public int getMonth() {
		return month;
	}
	public int getDate() {
		return date;
	}
	
	// setter method
	public void setYear(int year) {
		this.year = year;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public void setDate(int date) {
		this.date = date;
	}
	
	// 년, 월, 일을 한꺼변에 설정 및 변경
	public void setAll(int year, int month, int date) {
		this.year = year;
		this.month = month;
		this.date = date;
	}
	
	// 요일을 계산하는 method
	// 제라의 공식 - 요일을 0~6 사이의 숫자로 리턴
	// 0-sun ~ 6-sat
	public int dayOfWeek() {
		int y = year;
		int m = month;
		int d = date;
		
		if(m==1 || m==2) {
			--y;
			m += 12;
		}
		
		return (y + y/4 - y/100 + y/400 + (13*m+8)/5 + d) % 7;
	}
	
	// 2개의 날짜를 비교하는 instance method
	public boolean isSame(Day day2) {
		return this.year==day2.getYear() && this.month==day2.getMonth() && this.date==day2.getDate();
	}
	
	// print current date
	public void printCurrentDate() {
		System.out.print(year + "년 " + month + "월 " + date + "일 ");
	}
} // end