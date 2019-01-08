package chap15;

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
public class ArrayListTest {
public static void main(String[] args) {
	
	ArrayList list = new ArrayList(5);
//	list.add("java"); //0번 인덱스에 "java"
//	list.add(100); //1번 인덱스에 100
//	list.add(3.14); //2번 인덱스에 3.14
//	list.add(1, "sql"); //1번 인덱스에 "sql", 2번 인덱스에 100, 3번 인덱스에 3.14
	
	Emp e1 = new Emp(100, "홍길동", 67000.99);
	Emp e2 = new Emp(200, "박길동", 77000.99);
	Emp e3 = new Emp(300, "김길동", 87000.99);
	list.add(e1);
	list.add(e2);
	list.add(e3);
	 
	System.out.println(((Emp)list.get(0)).id);
	System.out.println("list.size : " + list.size());
	for(int i = 0; i < list.size(); i++) {
		System.out.println(list.get(i));
		if(list.get(i) instanceof Emp) { //혹시 Object 타입 전에 타입이 Emp였다면 
			System.out.println(((Emp)list.get(i)).name); //list.get(i) 인덱스를 Emp 타입으로 먼저 형변환하고 name을 출력 
		}
	}	
}
}
