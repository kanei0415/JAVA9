
class A{
	private int a;
	
	public A() {
		a = 50;
	}
	
	public int getA() {
		return a;
	}
}

class B extends A {
	public B() {
		super();
	}
}

public class PointTest01 {
	public static void main(String[] args) {
		B x = new B();
		
		System.out.println(x.getA());
	}
}
