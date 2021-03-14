package test;

import shape.*;

// 1. 5개의 도형을 담아서 처리할 수있는 배열 생성
// 2. 배열에 5개의 도형의 객체를 담으시오.
// 3. 다형성을 구현하여 5개의 도형을 출력하시오.
// 4. 직사각형과 평행사변형 객체는 면적도 출력하시오.

public class ShapeTest02 {
	public static void main(String[] args) {
		
		Shape[] shapes = {
			new Point(),
			new HorizontalLine(5),
			new VerticalLine(5),
			new Rectangle(5,5),
			new Parallelogram(5, 5),
		};
		
		for(Shape s : shapes) {
			s.print();
			
			if(s instanceof Plane2D) 
				System.out.println("면적은 " + ((Plane2D)s).getArea());
			
			System.out.println(); // 줄바꿈
		}
		
	}
}
