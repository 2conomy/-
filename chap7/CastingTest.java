package chap7;

class A {
	int va = 10;
	void ma() {
		System.out.println("A클래스");
	}
}
class B extends A {
	int vb = 20;
	void ma() {
		System.out.println("B클래스");
	}
	void mb() {
		System.out.println("B클래스추가메소드");
	}	
}
class C extends A {
	int vc = 30;
	void ma() {
		System.out.println("C클래스");
	}
}
class D extends C {
	int vd = 40;
	void ma() {
		System.out.println("D클래스");
	}
}
class E {
	void test(A v) {	
	}
	void call() {
		A a1 = new A();
		test(a1);
		B b1 = new B();
		test(b1);
	}
}
public class CastingTest {
public static void main(String[] args) {

	A myarray[] = new A[4];
	myarray[0] = new A();
	myarray[1] = new B();
	myarray[2] = new C();
	myarray[3] = new D();
	
	for(int i = 0; i < myarray.length; i++) {
		System.out.println(myarray[i].va);
		myarray[i].ma();
		
		if(i == 1) {
			System.out.println(((B)myarray[i]).vb);
			((B)myarray[i]).mb();
		} else if(i == 2) {
			System.out.println(((C)myarray[i]).vc);
		} else if(i == 3) {
			System.out.println(((D)myarray[i]).vd);
		}
	}
	
}
}
