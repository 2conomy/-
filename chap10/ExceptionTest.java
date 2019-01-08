package chap10;

public class ExceptionTest {
public static void main(String[] args) {

	try {
		//예외가 발생할 수 있는 문장 정의
		//발생되지 않으면 -> try 블럭 수행 
		//예외가 발생하면 -> catch 블럭 수행 
		int i = Integer.parseInt(args[0]);
		int j = Integer.parseInt(args[1]);
		System.out.println(i / j);
	} 
	
	catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("2개 입력 변수가 필요합니다.");
//		e.printStackTrace(); //발생 라인, 블록, 원인 메시지 추적 출력 
	} finally {
		System.out.println("항상 출력됩니다.");
	}
/*	} catch(Exception e) {
		System.out.println("모든 예외 동일 처리합니다.");
	} catch(NumberFormatException e ) {
		System.out.println("0-9 사이의 값만 입력하세요.");
//		e.printStackTrace();
	} catch(ArithmeticException e) {
		System.out.println("0은 입력할 수 없습니다.");
//		e.printStackTrace();
	}*/
	
	System.out.println("main완료");
	
	
	
	
}
}
