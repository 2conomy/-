package chap7;

class Employee {
	String title = "사원";
	int id;
	String name; //private : 현재 클래스에서만 사용하겠다. -> 상속 불가능 
	String dept;
	
	public void printField() { 
		System.out.println(id + ":" + name + ":" + dept);
	}
}

class Manager extends Employee{
	
	@Override
	public void printField() {
		// TODO Auto-generated method stub
		super.printField();
		System.out.println(jobOfManage + ":" + cntOfSubs);
	}
	
	void test() {
		System.out.println(title);
		System.out.println(super.title);
	}
	String title = "관리직";
	String jobOfManage; //관리 업무 내용 
	int cntOfSubs; //관리하는 사원의 수 
}
	
public class ManagerTest {
public static void main(String[] args) {

	Manager m = new Manager();
	m.id = 100;
	m.name = "홍길동";
	m.dept = "전산";
	m.jobOfManage = "전산실관리";
	m.cntOfSubs = 5;
	System.out.println(m.id + ":" + m.name + ":" + m.jobOfManage);
	m.test();
	m.printField();
}
}
