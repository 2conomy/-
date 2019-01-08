package chap4;

public class ScoreTest1 {
public static void main(String[] args) {
		
	
	//if 조건문
	
	String name = "김학생";
	int kor = 10;
	int eng = 89;
	int mat = 95;
	int sum = kor + eng + mat;
	int avg = sum / 3;
	double avgD = (double)sum / 3;
	System.out.println("국어점수=" + kor);
	System.out.println("영어점수=" + eng);
	System.out.println("수학점수=" + mat);
	System.out.println("총점=" + sum);
	System.out.println("평균(점수)=" + avg);
	System.out.println("평균(실수)=" + avgD);
	
	// 90점 이상 A등급
	// 80점이상 90점미만 B등급
	// 70점이상 80점미만 C등급
	// 60점이상 70점미만 D등급
	// 60점미만 미수료 

	if(avg >= 90) {
		System.out.println("A등급"); 
	}
	else if(avg >= 80) {
		System.out.println("B등급");
	}
	else if(avg >= 70) {
		System.out.println("C등급");
	}
	else if(avg >= 60) {
		System.out.println("D등급");
	}
	else {
		System.out.println("미수료");
	}
	}

}
