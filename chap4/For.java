package chap4;

public class For {
public static void main(String[] args) {

	
//	For문 : 0번 이상 유한횟수로 반복하고 싶을 때  
//	for(시작문장;반복조건문장;변화식문장){
//		반복적으로 수행할 문장들;
//	}
	
	
	int sum = 0;
	for(int i = 1 /*시작문장*/ ; i <= 10 /*이때까지 반복하라(boolean 타입)*/ ; i++ /*변화식문장*/) {
		sum = sum + i;
	}

	System.out.println(sum);
		
}
}