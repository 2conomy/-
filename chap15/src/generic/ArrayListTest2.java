package generic;

import java.util.ArrayList;

class Emp {
	int id;
	String name;
	double pay;
	public Emp(int id, String name, double pay) {
		this.id = id;
		this.name = name;
		this.pay = pay;
	}
	//참조타입 Emp의 toString을 오버라이딩하기 
	public String toString() {
		return id + "-" + name + "-" + pay;
	}
}
public class ArrayListTest2 {
public static void main(String[] args) {
	
	//ArrayList에 Emp 타입만 저장하기. generic 활용 
	ArrayList<Emp> list = new ArrayList<Emp>(5);
	
	Emp e1 = new Emp(100, "홍길동", 67000.99);
	Emp e2 = new Emp(200, "박길동", 77000.99);
	Emp e3 = new Emp(300, "김길동", 87000.99);
	list.add(e1);
	list.add(e2);
	list.add(e3);
	 
	list.set(2, new Emp(400, "김길동", 87000.99)); //1번 인덱스 100을 "newString"으로 
	
	Boolean exists = list.contains("java");
	Boolean exists2 = list.contains(e1);
	System.out.println("list.size : " + list.size());
	for(int i = 0; i < list.size(); i++) {
		System.out.println(list.get(i).name);
	}	
}
}
