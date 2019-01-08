
package chap11;

public class ObjectTest {
public static void main(String[] args) {

	Object o1 = new Object();
	Object o2 = new Object();
	
	System.out.println(o1);
	System.out.println(o2);
	
	if(o1 == o2) {
		System.out.println("o1 == o2 같음");
	}
	if(o1.equals(o2)) {
		System.out.println("o1.equals(o2) 같음");
	}
	
	
	MyObject o3 = new MyObject("청년취업");
	MyObject o4 = new MyObject("아카데미");
	MyObject o5 = new MyObject("아카데미");
	
	System.out.println(o3);
	System.out.println(o4);
	if(o3.equals(o4)) {
		System.out.println("o3.equals(o4) 비교 같다.");
	}
	if(o4.equals(o5)) {
		System.out.println("o4.equals(o5) 비교 같다.");
	}
	
}
}

class MyObject {
	String msg;
	MyObject(String msg) {
		this.msg = msg;
	}
	@Override
	public String toString() { //toString을 쓰면 heap 영역의 값이 나오도록 오버라이딩 
		return msg;
	}
	@Override
	public boolean equals(Object obj) { //equals를 쓰면 heap 영역의 값을 비교하도록 오버라이딩 
		if(obj instanceof MyObject) { //instanceof : 최초의 타입을 구할 때 
			boolean result = msg.equals(((MyObject)obj).msg);
			return result;
		} else {
			return false;
		}
	}
	
	
	
}