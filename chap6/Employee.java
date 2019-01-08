package chap6;

public class Employee {

	//회사원들을 객체로 표현하는 클래스
	//자바 모든 클래스 내부에는 기본 생성자가 자동으로 삽입되어 있음
	//기본 생성자 형태 : 클래스명 () {} >> Employee () {} 
	//사용자가 생성자를 새롭게 정의할 수도 있음 > 기본 생성자는 없어짐
	
	//1개 클래스 내부에도 여러 생성자 정의 가능
	//생성자 이름과 클래스 이름이 같고 
	//변수 갯수, 타입, 순서 중 1개 이상 다르게 정의 
	//생성자 overloading(중복정의)
	
	int id;
	String name;
	String dept;
	String title;
	String sub[] = new String[5];
	Employee(int id,String name, String dept, String title) {
		this.id = id;//this.id(필드변수), id(매개변수)
		this.name= name;
		this.dept = dept;
		this.title = title;
	}
	Employee(int id, String name) {
		this(id, name, "부서 미정", "직급 미정");
	}
	Employee() {
		this(-1, "이름 미정", "부서 미정", "직급 미정");
	}

	
	//클래스 필드변수들을 한번에 모아 출력하도록 toString을 사용할 수 있다.
	@Override
	public String toString() {
		return "사번은 " + id + "이고 이름은 " + name + ", 부서는 " + dept + "이며 직급은 " + title + "입니다.";
	}
	
}
	//1. 객체의 특성을 파악 
	//2. Employee 클래스 정의(회사원들을 표현하기 위해서) # Employee 클래스에서는 여기까지만 
	//3. 클래스로부터 객체들을 복사해 생성 -> 실행 시작 -> main 메소드 # EmployeeTest 클래스에서부터 