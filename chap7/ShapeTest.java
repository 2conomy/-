package chap7;

abstract class Shape {
	abstract void area();
	abstract void circum();
}

class Rectangle extends Shape{
	int width;
	int height;
	Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	void area() {
		int a = width * height;
		System.out.println("가로 " + width + ", 세로 " + height + "인 사각형의 면적 = " + a);
	}
	void circum() {
		int a = (width * 2) + (height * 2);
		System.out.println("가로 " + width + ", 세로 " + height + "인 사각형의 둘레 = " + a);
	}
}

class Circle extends Shape{
	int r; //반지름 필드변수
	Circle(int r) { //main에서 받는 r을 전달받도록 생성자 
		this.r = r;
	}
	void area() {
		double a = r * r * java.lang.Math.PI;
		System.out.println("반지름이 " + r + "인 원의 면적 = " + a);
	}
	void circum() {
		double a = (r * 2) * java.lang.Math.PI;
		System.out.println("반지름이 " + r + "인 원의 둘레 = " + a);
	}
	
}

public class ShapeTest {
public static void main(String[] args) {

	//cir 5 : 반지름 5인 Circle 객체 생성
	//rec 6 8 : 가로 6 세로 8인 Rectangle 객체 생성 
	//모든 객체의 면적 구하기, 둘레 구하기 메소드 구현 
	
	Shape s = null;
	
	if(args.length == 2 && args[0].equals("cir")) {
		s = new Circle(Integer.parseInt(args[1]));
	} else if(args.length == 3 && args[0].equals("rec")) {
		s = new Rectangle(Integer.parseInt(args[1]), Integer.parseInt(args[2]));
	}
	s.area();
	s.circum();
	

}
}
