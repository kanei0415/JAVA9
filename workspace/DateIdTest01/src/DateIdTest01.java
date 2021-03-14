import java.util.Calendar;

// 클래스 초기자
// 오늘 날짜를 이용하여 1씩 증가하는 일련번호를 생성하는  class
class DateId {
	private static long count = 0;
	private long id;
	
	// static initializer
	static {
		Calendar c = Calendar.getInstance();
		long year = c.get(Calendar.YEAR);
		long month = c.get(Calendar.MONTH) + 1; // 0~11까지의 index반환하므로 사용할 때는 1을 더해서 보정해야한다.
		long date = c.get(Calendar.DATE);
		
		count = year*10000000 + month*100000 + date*1000; 
		
		//System.out.printf("오늘은 %4d년 %2d월 %2d일 입니다.\n", year, month, date);
	}
	
	public DateId() {
		id = ++count;
	}
	
	public long getId() {
		return id;
	}
}

public class DateIdTest01 {
	public static void main(String[] args) {
		DateId a = new DateId();
		DateId b = new DateId();
		DateId c = new DateId();
		DateId d = new DateId();
		DateId e = new DateId();
		
		System.out.println("a = " + a.getId());
		System.out.println("b = " + b.getId());
		System.out.println("c = " + c.getId());
		System.out.println("d = " + d.getId());
		System.out.println("e = " + e.getId());
	}
}
