package chap5;

import java.util.Scanner;

public class ArrayTest1 {
public static void main(String[] args) {

	//5개의 정수를 저장하는 배열 만들기
	//1-100 사이의 난수 5개 발생해 배열에 저장
	//배열 선언 & 배열 생성(length 결정) 
	
	String names[] = new String[5];
	int scores[] = new int[5];
	System.out.println(scores.length);
	
	//배열 초기화 = 배열 내 저장
	
//	names[0] = "송혜교";
//	names[1] = "장나라";
//	names[2] = "하정우";
//	names[3] = "아이린";
//	names[4] = "박재형";
	
	Scanner sc = new Scanner(System.in);
	for(int i = 0; i < scores.length; i++) {
		System.out.println(i + "번째 이름 입력하세요.");
		names[i] = sc.next();
		scores[i] = (int)(Math.random() * 100) + 1; //scores 배열 내에 값을 저장하는 코드 
		System.out.println(names[i] + " 학생의 점수는  " + scores[i]);
	}	
	
	//합계와 평균 구하기
	
	int sum = 0;
	int avg = 0;
	for(int j = 0; j < scores.length; j++) {
		sum = sum + scores[j];
	}
	System.out.println("합계 : " + sum);
	avg = sum / (scores.length);
	System.out.println("평균 : " + avg);
	
	//배열 선언+생성+초기화 1문장으로 
	String title[] = {"java", "html5", "javascript", "sql", "css", "jquery", "hadoop", "r", "python"};
	System.out.println(title.length);
	
		
}
}