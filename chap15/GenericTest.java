package generic;

class Box<T, E> {
	T contents;
	E classid;
	Box(T c) {
		contents = c;
	}
	Box(T c, E id) {
		contents = c;
		classid = id;
	}
	public void setContents(T c) {
		contents = c;
	}
	public T getContents() {
		return contents;
	}
}
class Paper {
	String size;
	Paper(String size) {
		this.size = size;
	}
}
class Apple {
	String origin;
	Apple(String origin) {
		this.origin = origin;
	}
}

public class GenericTest {
public static void main(String[] args) {

	Paper p = new Paper("A4");
	Apple a = new Apple("청송");
	
	Box<Paper, String> paperBox = new Box<Paper, String>(p, "공산품"); //제너릭 문법이 없다면 Box 클래스는 매개변수로 String이랑 int를 모두 받아야 하기 때문에 Object를 받아야 한다.
	Box<Apple, Integer> appleBox = new Box<Apple, Integer>(a, 100);
	
	Paper o1 = paperBox.getContents();
	System.out.println(o1.size);
	System.out.println(paperBox.classid); //String
	Apple o2 = appleBox.getContents();
	System.out.println(o2.origin);
	System.out.println(appleBox.classid); //Integer
}
}
