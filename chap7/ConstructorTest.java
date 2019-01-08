package chap7;

class C1 /* extends Object 생략 */{
	int i;
	C1(String s) { //상위클래스 생성자에 매개변수 String s가 있음 
		//super(); << 자동정의지만 없는 것이 아니라 java.lang.object 클래스가 숨겨져 있음 
		System.out.println("C1생성자호출");
		i = 10 * 10;
	}
}

class C2 extends C1 {
	int j;
	C2() {
		super("aaa"); //상위클래스 생성자에 매개변수가 있어 String s를 "aaa"로 정의해줬다 
		//super(); << 자동정의. 상위클래스(C1)의 매개변수가 없는 생성자 호출.
		System.out.println("C2생성자호출");
		j = 10 * 10 * 10;
	}
}

public class ConstructorTest {
public static void main(String[] args) {

	C2 c = new C2(); //Object 객체 생성 -> C1() 객체 생성 -> C2() 객체 생성 
	System.out.println(c.j);
	System.out.println(c.i);
	
}
}
