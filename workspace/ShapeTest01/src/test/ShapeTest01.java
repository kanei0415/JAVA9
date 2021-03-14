package test;

import shape.*;

// 1. 4가지 도형을 담을 수 있는 Shape 형의 배열 shapes를 만드시오.
// 2. shapes에 4가지 도형을 담으시오.
// 3. 다형성을 구현하여 4가지 도형을 출력하시오. (2가지 방법 - 기본for문, for-in문)
public class ShapeTest01 {
	public static void main(String[] args) {
//		Shape s = new Shape(); // 추상클래스는 인스턴스를 만들 수 없다.
		Shape[] shapes = new Shape[4];
		// 1번 방법
		shapes = new Shape[] {
				new Point(),
				new Rectangle(10,20),
				new HorizontalLine(5),
				new VerticalLine(5),
		};
		
		// 2번 방법
//		shapes[0] = new Point();
//		shapes[1] = new Rectangle(10,20);
//		shapes[2] = new HorizontalLine(5);
//		shapes[3] = new VerticalLine(5);

		// 1번 방법 - 기본 for문
		for(int i=0; i<shapes.length; i++) {
			shapes[i].print();
			System.out.println();
		}
		
		// 2번 방법 - for-in문
		System.out.println();
		
		for(Shape s : shapes) {
			s.print();
			System.out.println();
		}
	}
}
