package chap4;

public class ScoreTest {
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
	// 70점 이상 수료 / 미수료
	if(avg >= 70) {
		System.out.println("수료");
	}
	else {
		System.out.println("미수료");
	}
	}

}
