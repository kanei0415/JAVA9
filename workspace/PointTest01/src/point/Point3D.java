package point;

// 자식 클래스
public class Point3D extends Point2D {
	private int z;
	
	public Point3D(int x, int y, int z) {
		super(x, y);
		this.z = z;
	}
	
	public Point3D() {
		
	}
	
	public void setZ(int z) {
		this.z = z;
	}
	
	public int getZ() {
		return z;
	}
	
	public String toString() {
		return super.toString() + ", " + z;
	}
}
