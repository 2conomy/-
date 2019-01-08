package chap7;

final class Math { //클래스에 final 선언이 되어 있다면 객체를 만들어서 클래스 안에 있는 메소드를 사용해야 한다.
	public int abs(int data) {
		//매개변수 data의 절대값을 리턴 
		if (data < 0) return data * -1;
		else return data;
	}
}

class MyMath{
	
	public int abs(int data) {
		Math m = new Math();
		return m.abs(data);
	}
	
	void power() {
		System.out.println("절대값을 구합니다.");
	}
}



public class MathTest {
public static void main(String[] args) {

	MyMath m = new MyMath();
	m.power();
	System.out.println(m.abs(10));
	System.out.println(m.abs(-10));
	
	

}
}
