import java.util.Scanner;

public class DayTest02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("<생년월일을 입력하세요>");
		System.out.print("년 입력 : ");
		int y = sc.nextInt();
		System.out.print("월 입력 : ");
		int m = sc.nextInt();
		System.out.print("일 입력 : ");
		int d = sc.nextInt();
		
		Day birthday = new Day(y, m, d);
		
		// birthday가 참조하는 곳을 xDay도 참조한다.
		// 다시말하면 birthday와 xDay는 같은 곳을 참조한다.
		//Day xDay = birthday; // 실제 instance를 copy한 것이아니라 reference만 복사한다.
		//xDay.setAll(2022, 6, 13);
		
		// birthday의 속성을 copy한 xDay생성
		Day xDay = new Day(birthday); // instance를 생성하여 birthday의 속성을 copy
		xDay.setAll(2022, 6, 13);
		
		String[] weekDay = {"일", "월", "화", "수", "목", "금", "토"};
		
		System.out.print("bitrhday == ");
		birthday.printCurrentDate();
		System.out.println(weekDay[birthday.dayOfWeek()] + "요일");
		System.out.println();
		
		System.out.print("xDay == ");
		xDay.printCurrentDate();
		System.out.println(weekDay[xDay.dayOfWeek()] + "요일");
		System.out.println();
		
		sc.close();
	}
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
	// print current date
	public void printCurrentDate() {
		System.out.print(year + "년 " + month + "월 " + date + "일 ");
	}
}
