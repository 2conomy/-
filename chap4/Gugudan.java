package chap4;

public class Gugudan {
public static void main(String[] args) {

	// 2단 구구단 출력
	// 2 * 1 = 2 ... 2 * 9 = 18
//	
//	for(int i = 1; i <= 9; i++) {
//		System.out.println(2 + "*" + i + " = " + 2*i);
//	}
	
	// 구구단 출력
	// 2 * 1 = 2 ... 2 * 9 = 18 ... 3 * 1 = 3 ... 3 * 9 = 27 ... 9 * 9 = 81
		
	for(int i = 1; i <= 9; i++) {
		for(int j = 2; j <= 9; j++) {
			if(j == 5) {continue;}   //구구단 4단까지
			System.out.print(j + " * " + i + " = " + i*j + "\t");
		}
		System.out.println("");
	}
		
		
}
}
