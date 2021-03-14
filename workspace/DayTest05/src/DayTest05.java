
public class DayTest05 {
	public static void main(String[] args) {
		
	} 
}

//날짜 Class
//instance variable : year month date
//constructor getter setter print setAll
class Day{
	// instance variable
	private int year = 1970; // 초기값
	private int month = 1;
	private int date = 1;
	
	// default constructor
	public Day() {
//		year = 1970;
//		month = 1;
//		date = 1;
	}
	public Day(int year) {
		this.year = year; // year값은 여기서 설정
	}
	public Day(int year, int month) {
//		this.year = year;
		this(year);
		this.month = month; // month값은 여기서 설정
	}
	// constructor overloading
	public Day(int year, int month, int date){
//		this.year = year;
//		this.month = month;
		this(year, month);
		this.date = date; // date값은 여기서 설정
	}
	// copy constructor
	// this() : 생성자 안에서 다른 생성자를 호출
	public Day(Day birthday) {
//		this.year = birthday.year;
//		this.month = birthday.month;
//		this.date = birthday.date;
		this(birthday.year, birthday.month, birthday.date);
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
	
	// 요일 정보를 출력하는 method
	// toString - method는 Object Class로 부터 오버라이딩
	public String toString() {
		String[] weekDay = {"일", "월", "화", "수", "목", "금", "토"};
		return String.format("%4d년 %2d월 %2d일 (%s요일)", year, month, date, weekDay[dayOfWeek()]);
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