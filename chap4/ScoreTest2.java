package chap4;

public class ScoreTest2 {
public static void main(String[] args) {
		
	
	//점수변경 랜덤 (1 ~ 100 사이의 난수)
	//Math.random() : 0.0부터 0.9999999...까지의 난수 출력
	//Math.random() * 100 : 0.0부터 99.9999999...까지의 난수 출력
	//(int)(Math.random() * 100) : 0부터 99까지의 난수 출력
	//(int)(Math.random() * 100) + 1 : 1부터 100까지의 난수 출
		String name = "김학생";
		int kor = (int)(Math.random() * 100) + 1;
		int eng = (int)(Math.random() * 100) + 1;
		int mat = (int)(Math.random() * 100) + 1;
		int sum = kor + eng + mat;
		int avg = sum / 3;
		double avgD = (double)sum / 3;
		System.out.println("국어점수=" + kor);
		System.out.println("영어점수=" + eng);
		System.out.println("수학점수=" + mat);
		System.out.println("총점=" + sum);
		System.out.println("평균(점수)=" + avg);
		System.out.println("평균(실수)=" + avgD);
	
		//Source - Add Block Comment에서 숨길 수 있음
		
/*		if(avg >= 90) {
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
		}*/
		
		
		int avg2 = avg / 10; //avg를 1의 자리로 만들기
		
		switch(avg2) {
		case 9:
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");
			break;
		case 7:
			System.out.println("C");
			break;
		case 6:
			System.out.println("D");
		default :
			System.out.println("F");
		}


}
}
