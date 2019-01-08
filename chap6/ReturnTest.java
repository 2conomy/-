package chap6;

class A{ //두 개 이상의 클래스가 하나의 자바파일에 선언되는 것이 가능 , class A는 ma, mb, mc 3개의 메소드를 가
	int ma() { //메소드 정의 = 구현, main 전에 정의하는 것은 실행이 아니다.
		int i = 10; //지역변수 i
		return i * i; //ma() 메소 내부니까 i를 쓸 수 있다.
	}
	double mb() {
		return 3.14;
	}
	String mc() {
		String s = "java";
		return s + s;
	}
	void md(int j) { //void : return값이 없을 때 사용, 직접 출력하겠다 
		// j * j >= 100 이상일 때만 출력하고 싶다면?
		if(j * j >= 100) {
			System.out.println(j*j);
		} else {
			return; //메소드 중단하고 호출한 곳으로 이동하라(밑에 있는 syso 출력하지 않음) 
		}
		System.out.println("md메소드종료");
	}
}

public class ReturnTest { //public 선언이 된 class의 이름이 자바파일의 이름이 되도록 
public static void main(String[] args) {

	//main 이후에서 문장이 실행된다 = 객체가 생성된다 = 메모리가 변화, 출력된다
	//메소드 호출
	
	A a1 = new A();
	
	int result = a1.ma();
	System.out.println(result);
	
	double result2 = a1.mb();
	System.out.println(result2);
	
	String result3 = a1.mc(); //result3을 가지고 추가적인 작업이 가능하다.
	System.out.println(result3);
	
	a1.md(5); //void가 있을 때는 호출만 해도 출력할 수 있다. (읽기전용 결과)
	a1.md(10);
	
	System.out.println("main종료");
	
	
}
}
