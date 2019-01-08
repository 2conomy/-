package chap10;

public class ThrowTest {
public static void main(String[] args) {

	//throws + 예외 클래스
	//throw + 객체 선
	int id = -100;
	try {
		if (id <= 0) {
			throw new Exception("존재할 수 없는 사번");
		}
	} catch (Exception e) {
		System.out.println(e.getMessage());
	}
	System.out.println("사번:" + id);
	
	
	
	
	

}
}
