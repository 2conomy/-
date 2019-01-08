package chap4;

import java.util.Scanner;	//클래스 선언 전에 Scanner 라이브러리 불러오기 
public class SalaryTest {
public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);	//Scanner 라이브러리 불러오기 
	String title = sc.next(); //console에서 키보드로 입력받는 방법!! Run한 후 입력하면 조건에 따라 결과가 나
	
	int baseSalary = 30000;
	int totalSalary = 0; //switch {} 앞에서 totalSalary를 0으로 선언 
	
	//사원 totalS = 기본급 + 5000
	//대리 totalS = 기본급 + 기본급의 20%
	//과장 totalS = 기본급 + 기본급의 50%
	//나머지 totalS = 기본급 200%
	
	switch(title) {
	case "사원" :
		totalSalary = baseSalary + 5000;
		break;
	
	case "대리" :
		totalSalary = (int)(baseSalary * 1.2); //정수와 실수의 곱인데 totalSalary가 정수이기 때문에 계산한 후 int로 형변환
		break;
		
	case "과장" :
		totalSalary = (int)(baseSalary * 1.5);
		break;
		
	default :
		totalSalary = baseSalary * 2;
	}
	
	System.out.println(title + " 직급의 급여는 " + totalSalary + "입니다.");
	
}
}
