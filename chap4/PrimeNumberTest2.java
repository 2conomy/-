package chap4;

public class PrimeNumberTest2 {
public static void main(String[] args) {

	//2부터 난수 su 될 때까지 계속 판별 
	//su가 소수인지 판단하여 출력 : 1과 자신수 외에는 나누어지지 않는 자연수 
	//2 : 소수이다.
	//3 : 소수이다.
	//4 : 소수가 아니다.
	//5 : 소수이다.
	int su = (int)(Math.random() * 100) + 1; //난수 선언 
	
	int cntOfZero = 0; //소수를 알아내기 위한 변수 선언 
	for(int i = 2; i <= su; i++) {		//2부터니까 int i = 2; su까지 가니까 i <= su; 하나씩 더해야 돼서 i++ 
		for(int j = 1; j <= i; j++) { 	//i가 소수인지 알기 위한 과정 
			if(i % j == 0) {				//i를 j로 나눴을 때 나머지가 0이면 
				cntOfZero++;	//1씩 더해라 
			}
		}
		if(cntOfZero == 2) {			//cntOfZero가 2면(= 소수이면) 
			System.out.println(i + " : 소수이다.");
			cntOfZero = 0;				//cntOfZero는 다시 0으로 
		} else {						//그렇지 않으면 
			System.out.println(i + " : 소수가 아니다.");
			cntOfZero = 0;
		}
	}		
	
	
}		
}
