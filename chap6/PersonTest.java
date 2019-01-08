package chap6;

class Person {
	String name;
	int age;
	static String nation = "대한민국"; //1개의 값을 정적 선언 -> 모든 객체들이 공유 
	public Person(String name, int age) { //source - Generate constructor using Fields
		//super();
		this.name = name;
		this.age = age;
	}
	
}

public class PersonTest {
public static void main(String[] args) {

	System.out.println(Person.nation);
	
	//p1, p2가 만들어지기 전에 static nation = "대한민국"이 먼저 heap 영역에 있게 됨 

	Person p1 = new Person("홍길동", 29);
	System.out.println("p1 객체의 이름은 " + p1.name + "이고 나이는 " + p1.age + "이며 국적은 " + Person.nation + "입니다.");
	Person p2 = new Person("박보검", 24);
	System.out.println("p2 객체의 이름은 " + p2.name + "이고 나이는 " + p2.age + "이며 국적은 " + Person.nation + "입니다.");
	
	//p1.nation과 p2.nation의 주소값은 같다(같은 주소를 공유) 
	
	
	
}
}
