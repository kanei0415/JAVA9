
public class StringBufferTest03 {
	public static void main(String[] args) {
		
		StringBuffer sb1 = new StringBuffer("ABC");
		System.out.println(sb1);
		System.out.println(System.identityHashCode(sb1));
		System.out.println();
		
		sb1.append(" DEF");
		System.out.println(sb1);
		System.out.println(System.identityHashCode(sb1));
		System.out.println();
		
		sb1.append(10);
		System.out.println(sb1);
		System.out.println(System.identityHashCode(sb1));
		System.out.println();
		
		sb1.append(true);
		System.out.println(sb1);
		System.out.println(System.identityHashCode(sb1));
		System.out.println();
		
		// method chaining ¹æ¹ý
		sb1.append(" XYZ").append('c').append(false).append(3.14);
		System.out.println(sb1);
		System.out.println(System.identityHashCode(sb1));
		System.out.println();
		
		StringBuffer sb2 = new StringBuffer();
		System.out.println("Capacity() : " + sb2.capacity());
		System.out.println("Length() : " + sb2.length());
		System.out.println();
		
		sb2.append("HELLO JAVA WORLD!");
		System.out.println("Capacity() : " + sb2.capacity());
		System.out.println("Length() : " + sb2.length());
		System.out.println();
		
		StringBuffer sb3 = new StringBuffer(10);
		System.out.println("Capacity() : " + sb3.capacity());
		System.out.println("Length() : " + sb3.length());
		System.out.println();
		
	}
}
