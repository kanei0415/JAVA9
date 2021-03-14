class XY {
	private static int count;
	private int id;
	private int x = 0;
	private int y = 0;
	
	// instance initializer - non-static initializer
	// 매 생성자 사용 직전에 호출된다. 
	{
		id = ++count;
	}
	
	public XY() {
//		id = ++count;
	}
	
	public XY(int x) {
		this.x = x;
//		id = ++count;
	}
	
	public XY(int x, int y) {
		this.x = x;
		this.y = y;
//		id = ++count;
	}
	
	public XY(XY a){
		this.x = a.x;
		this.y = a.y;
//		id = ++count;
	}
	
	// toString
	public String toString() {
		return "No." + id + " : ("  + x + ", " + y + ")"; 
	}
}

public class XYTest01 {
	public static void main(String[] args) {
		XY p1 = new XY();
		XY p2 = new XY(10);
		XY p3 = new XY(30, 40);
		XY p4 = new XY(p3);
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		System.out.println(p4);
	}
}
