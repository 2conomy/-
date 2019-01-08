package chap6;

public class EmployeeTest {
public static void main(String[] args) {

	// 객체들을 복사해야 됨
	//클래스이름(Employee라는 클래스) 변수명(객체 주소를 참조하는 변수) = new(개체를 생성해주는 연산자 new) 생성자();
	
	Employee e1 = new Employee(1234, "홍길동", "인사부", "사원"); //Heap 영역에 Employee의 복사본을 만들어라. 클래스 이름이 그대로 타입으로 온다.
	System.out.println(e1.toString());
	
	Employee e2 = new Employee(2234, "김유정"); //Heap 영역에 Employee의 복사본을 만들어라. 클래스 이름이 그대로 타입으로 온다.
	System.out.println(e2);
	
	Employee e3 = new Employee();
	System.out.println(e3);
	
	//System.out.print(객체) : 자동으로 toString 메소드로 출력 
}
}