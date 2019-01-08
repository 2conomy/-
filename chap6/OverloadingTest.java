package chap6;

//메소드 오버로
class B {
	int add(int i, int j) { //int 연산과 
		return i+j;
	}
	String add(String i, String j) { //String 연산 둘 다 가능 (add 메소드 안에)
		return i+j;
	}
	double add(double i, double j) { //double 연산도 역시 가능하다 
		return i+j;
	}
}


public class OverloadingTest {
public static void main(String[] args) {

	B b1 = new B();
	double r1 = b1.add(1.1, 2.2);
	String r2 = b1.add("java", "jsp");
	int r3 = b1.add(1, 2);
	double r4 = b1.add(100, 200.22);
	
	System.out.println(r1);
	System.out.println(r2);
	System.out.println(r3);
	System.out.println(r4);
	
	//라이브러리(API)에서 오버로딩 구현한 예제 
	//"100"을 정수로 해석하고 싶을 때 
	int dec = Integer.parseInt("100");
	System.out.println(dec); //100
	
	//"100"을 2진수 100으로 해석하고 싶을 때 
	int bin = Integer.parseInt("100", 2);
	System.out.println(bin); //4
	
	//"100"을 8진수 100으로 해석하고 싶을 때
	int bin2 = Integer.parseInt("100", 8);
	System.out.println(bin2); //64
	
}
}
