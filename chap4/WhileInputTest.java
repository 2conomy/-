package chap4;

import java.util.Scanner; //Source - Organize Import에서 자동 실행

public class WhileInputTest {
public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	//String input = sc.next(); //진행 or 종료 
	//System.out.println(input);
	
	
	// ==를 쓸 수 있을 때 : boolean, char, int, double
	// String을 비교할 때는 : equals() 메소드 
	
	//while(true) { 무한루프 }
	//do-while : 최소 1번 이상의 반복 무조건 실행 
	
//	while(input.equals("진행") ) {
//		System.out.println("프로그램 수행 중입니다.");
//		System.out.println("계속 하려면 진행을 입력하세요.");
//		input = sc.next();
//	}
//	System.out.println("프로그램을 종료합니다.");
	
	while(true) {
		System.out.println("프로그램 수행 중입니다.");
		System.out.println("계속 하려면 진행을 입력하세요.");
		String input = sc.next();
		if(input.equals("종료")) {
			System.out.println("프로그램 종료합니다.");
			break;
			}
	}
	
}
}
