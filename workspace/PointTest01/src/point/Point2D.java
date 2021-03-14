package point;

//import java.lang.Object;

// 부모 클래스
public class Point2D /*extends Object*/ {
	private int x;
	private int y;
	
	public Point2D(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public Point2D() {
//		super();
	}
	
	public void setX(int x) {
		this.x = x;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	
	public String toString() {
		return x + ", " + y;
	}
}
