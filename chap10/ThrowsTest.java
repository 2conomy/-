package chap10;

class Test {
	void ma(int i) throws ArithmeticException {
		System.out.println(100 / i);
	}
	void mb() {
		try {
			ma(0);
		} catch(ArithmeticException e) {
			System.out.println("0으로 나눌 수 없음.");
		}
	}
	void mc() {
		try {
			ma(0);
		} catch(ArithmeticException e) {
			ma(100);
		}
	}
}

public class ThrowsTest {
public static void main(String[] args) {

	Test t = new Test();
	try {
		t.mb();
	} catch(ArithmeticException e) {
		System.out.println("0 나누기 오류");
	}

	//라이브러리 메소드 : throws xxxexception
	//ClassNotFoundException
	try {
		Class.forName(args[0]);
		System.out.println("존재하는 클래스입니다.");
	} catch(ClassNotFoundException e) {
		System.out.println("그런 이름의 클래스는 존재하지 않습니다.");
	}

}
}
