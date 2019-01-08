package chap4;

public class SumTest {
public static void main(String[] args) {


//	int sum = 0;
//	for(int i = 1; i <= 10; i++) { 
//		//System.out.println(i);
//		sum = sum + i;
//		System.out.println(i + ":" + sum); //i가 for문 안에 있다. i가 for문 밖에 있으면 sysout문장을 밖으로 뺄 수 있음.
//	}
	
	
	//i를 for문 밖에서 선언 
//	int sum = 0;
//	int i = -1;
//	for(i = 1; i <= 10; i++) { 
//		//System.out.println(i);
//		sum = sum + i;
//	}
//	System.out.println(i + ":" + sum); 
	
	//짝수의 합 
	int sum = 0;
	int i = -1;
	for(i = 1; i <= 10; i = i + 2) { 
		sum = sum + i;					 //if문으로 조건을 걸어도 가능 
	}
	System.out.println(i + ":" + sum);
	
	
}
}