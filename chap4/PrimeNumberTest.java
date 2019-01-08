package chap4;

public class PrimeNumberTest {
public static void main(String[] args) {

	//숫자 하나만 소수인지 아닌지 판
	int su = (int)(Math.random() * 100) + 1;
	// su가 소수인지 판단하여 출력 : 1과 자신수 외에는 나누어지지 않는 자연수 
	// 13 : 소수이다
	// 15 : 소수가 아니다 
	// for + if
	
	// 13 % 1 == 0 / 13 % 13 == 0 이 두가지만 나머지가 0이고
	// 13 % 2, 13 % 3, 13 % 4 ... 나머지가 0이면 안됨
	// 13 % (1~13) == 0 : 2개만!
	
	int a = 0;
	for(int i = 1; i <= su; i = i + 1) {
		if(su % i == 0) {
			a = a + 1;
		}
	}						//여기서 반복문을 끝내고 a를 비교하기 
	
	if(a == 2) {
		System.out.println(su + " : 소수이다.");
	}
	else {
		System.out.println(su + " : 소수가 아니다.");
	}
				
}			
}
