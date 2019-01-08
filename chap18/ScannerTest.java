package chap18;

import java.util.Scanner;

public class ScannerTest {
public static void main(String[] args) {

	System.out.println("입력시작");
	Scanner key = new Scanner(System.in); //System.in << 키보드로 입력된 문자를 스캐너 객체로 변환한다.
//	String line = key.nextLine(); //String으로 리턴(공백을 포함한 줄 전체)
//	System.out.println(line);
	
	String word = key.next();
	int num1 = key.nextInt();
	double num2 = key.nextDouble();
//	key.next(); //String(공백 이전 단어만)
//	key.nextInt();
//	key.nextDouble();
	
	System.out.println(word);
	System.out.println(num1+num2);
	

}
}
